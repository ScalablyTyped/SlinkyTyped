package typingsSlinky.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// Attributes
// see http://docs.angularjs.org/api/ng.$compile.directive.Attributes
///////////////////////////////////////////////////////////////////////////
@js.native
trait IAttributes
  extends /**
  * Indexer which should return ng.INgModelController for most properties but cannot because of "All named properties must be assignable to string indexer type" constraint - see https://github.com/Microsoft/TypeScript/issues/272
  */
/* name */ StringDictionary[js.Any] {
  /**
    * A map of DOM element attribute names to the normalized name. This is needed
    * to do reverse lookup from normalized name back to actual name.
    */
  @JSName("$attr")
  var $attr: js.Object = js.native
  /**
    * Adds the CSS class value specified by the classVal parameter to the
    * element. If animations are enabled then an animation will be triggered
    * for the class addition.
    */
  @JSName("$addClass")
  def $addClass(classVal: String): Unit = js.native
  /**
    * Converts an attribute name (e.g. dash/colon/underscore-delimited string, optionally prefixed with x- or data-) to its normalized, camelCase form.
    *
    * Also there is special case for Moz prefix starting with upper case letter.
    *
    * For further information check out the guide on @see https://docs.angularjs.org/guide/directive#matching-directives
    */
  @JSName("$normalize")
  def $normalize(name: String): String = js.native
  /**
    * Observes an interpolated attribute.
    * The observer function will be invoked once during the next $digest
    * following compilation. The observer is then invoked whenever the
    * interpolated value changes.
    */
  @JSName("$observe")
  def $observe[T](name: String, fn: js.Function1[/* value */ js.UndefOr[T], _]): Function = js.native
  /**
    * Removes the CSS class value specified by the classVal parameter from the
    * element. If animations are enabled then an animation will be triggered for
    * the class removal.
    */
  @JSName("$removeClass")
  def $removeClass(classVal: String): Unit = js.native
  /**
    * Set DOM element attribute value.
    */
  @JSName("$set")
  def $set(key: String, value: js.Any): Unit = js.native
  /**
    * Adds and removes the appropriate CSS class values to the element based on the difference between
    * the new and old CSS class values (specified as newClasses and oldClasses).
    */
  @JSName("$updateClass")
  def $updateClass(newClasses: String, oldClasses: String): Unit = js.native
}

object IAttributes {
  @scala.inline
  def apply(
    $addClass: String => Unit,
    $attr: js.Object,
    $normalize: String => String,
    $observe: (String, js.Function1[/* value */ js.UndefOr[js.Any], _]) => Function,
    $removeClass: String => Unit,
    $set: (String, js.Any) => Unit,
    $updateClass: (String, String) => Unit
  ): IAttributes = {
    val __obj = js.Dynamic.literal($addClass = js.Any.fromFunction1($addClass), $attr = $attr.asInstanceOf[js.Any], $normalize = js.Any.fromFunction1($normalize), $observe = js.Any.fromFunction2($observe), $removeClass = js.Any.fromFunction1($removeClass), $set = js.Any.fromFunction2($set), $updateClass = js.Any.fromFunction2($updateClass))
    __obj.asInstanceOf[IAttributes]
  }
  @scala.inline
  implicit class IAttributesOps[Self <: IAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$addClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$addClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with$attr(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$normalize(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$normalize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with$observe(value: (String, js.Function1[/* value */ js.UndefOr[js.Any], _]) => Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$observe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$removeClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with$set(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with$updateClass(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$updateClass")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

