package typingsSlinky.activexLibreoffice.com_.sun.star.animations

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for generic animation.
  * @see http://www.w3.org/TR/smil20/animation.html#edef-animate
  */
@js.native
trait XAnimate extends XAnimationNode {
  /**
    * Controls whether or not the animation is cumulative.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-accumulate
    */
  var Accumulate: Boolean = js.native
  /**
    * Controls whether or not the animation is additive.
    * @see AnimationAdditiveMode
    * @see http://www.w3.org/TR/smil20/animation.html#adef-additive
    */
  var Additive: Double = js.native
  /**
    * Specifies the target attribute.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-attributeName
    */
  var AttributeName: String = js.native
  /**
    * Specifies a relative offset value for the animation. ;  Must be a legal value of a domain for which addition to the attributeType domain is defined
    * and which yields a value in the attributeType domain. Ignored if the values attribute is specified. Ignored if the {@link Values} attribute is
    * specified.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-by
    */
  var By: js.Any = js.native
  /**
    * Specifies the interpolation mode for the animation. ;  If the target attribute does not support linear interpolation (e.g. for strings), or if the
    * values attribute has only one value, the CalcMode attribute is ignored and discrete interpolation is used.
    * @see AnimationCalcMode;
    */
  var CalcMode: Double = js.native
  /**
    * if this string is set, its contents will be parsed as a formula. All values are used as a parameter for this formula and the computed result will be
    * used.
    */
  var Formula: String = js.native
  /**
    * Specifies the starting value of the animation. ;  Must be a legal value for the specified attribute. Ignored if the {@link Values} attribute is
    * specified.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-from
    */
  var From: js.Any = js.native
  var KeyTimes: SafeArray[Double] = js.native
  /**
    * This attribute specifies an optional subitem from the target element that should be animated. ;  A value of zero should always be the default and
    * animate the complete target. ;  See documentation of used animation engine for supported subitems.
    */
  var SubItem: Double = js.native
  /** This attribute specifies the target element to be animated. ;  See documentation of used animation engine for supported targets. */
  var Target: js.Any = js.native
  /** todo: timeFilter="0,0; 0.14,0.36; 0.43,0.73; 0.71,0.91; 1.0,1.0" ? */
  var TimeFilter: SafeArray[TimeFilterPair] = js.native
  /**
    * Specifies the ending value of the animation. ;  Must be a legal value for the specified attribute. Ignored if the {@link Values} attribute is
    * specified.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-to
    */
  var To: js.Any = js.native
  /** @see AnimationValueType */
  var ValueType: Double = js.native
  /**
    * A sequence of one or more values, each of which must be a legal value for the specified attribute.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-values
    */
  var Values: SafeArray[_] = js.native
}

object XAnimate {
  @scala.inline
  def apply(
    Acceleration: Double,
    Accumulate: Boolean,
    Additive: Double,
    AttributeName: String,
    AutoReverse: Boolean,
    Begin: js.Any,
    By: js.Any,
    CalcMode: Double,
    Decelerate: Double,
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    Fill: Double,
    FillDefault: Double,
    Formula: String,
    From: js.Any,
    KeyTimes: SafeArray[Double],
    Parent: XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: Double,
    RestartDefault: Double,
    SubItem: Double,
    Target: js.Any,
    TimeFilter: SafeArray[TimeFilterPair],
    To: js.Any,
    Type: Double,
    UserData: SafeArray[NamedValue],
    ValueType: Double,
    Values: SafeArray[_],
    acquire: () => Unit,
    getParent: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setParent: XInterface => Unit
  ): XAnimate = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], Accumulate = Accumulate.asInstanceOf[js.Any], Additive = Additive.asInstanceOf[js.Any], AttributeName = AttributeName.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], CalcMode = CalcMode.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], KeyTimes = KeyTimes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], SubItem = SubItem.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeFilter = TimeFilter.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XAnimate]
  }
  @scala.inline
  implicit class XAnimateOps[Self <: XAnimate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccumulate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accumulate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Additive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("By")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalcMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalcMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("From")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyTimes(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubItem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeFilter(value: SafeArray[TimeFilterPair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: SafeArray[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

