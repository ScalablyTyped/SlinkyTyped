package typingsSlinky.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper wrapping instances.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityDeque<Wrap> * / any */ @js.native
trait Wrapper extends Instance {
  @JSName("$height")
  var $height: String = js.native
  @JSName("$length")
  var $length: String = js.native
  @JSName("$name")
  var $name: String = js.native
  @JSName("$price")
  var $price: String = js.native
  @JSName("$scale")
  val $scale: String = js.native
  @JSName("$spaceUtilization")
  val $spaceUtilization: String = js.native
  @JSName("$thickness")
  var $thickness: String = js.native
  @JSName("$width")
  var $width: String = js.native
  /**
    * Height of the Wrapper, length on the Y-axis in 3D.
    */
  var height: Double = js.native
  /**
    * Length of the Wrapper, length on the Z-axis in 3D.
    */
  var length: Double = js.native
  /**
    * <p> Name, key of the Wrapper. </p>
    *
    * <p> The name represents a type of Wrapper and identifies the Wrapper. </p>
    */
  var name: String = js.native
  /**
    * Price, cost of using an Wrapper.
    */
  var price: Double = js.native
  /**
    * <p> Thickness, margin of a Wrapper causes shrinkness of containable volume. </p>
    *
    * <p> The thickness reduces each dimension's containable size (dimension - 2*thickness),
    * so finally, it reduces total containable volume (-8 * thickness^3). </p>
    */
  var thickness: Double = js.native
  /**
    * Width of the Wrapper, length on the X-axis in 3D.
    */
  var width: Double = js.native
  /**
    * @inheritdoc
    */
  def CHILD_TAG(): String = js.native
  /**
    * @inheritdoc
    */
  def TAG(): String = js.native
  /**
    * <p> Wrapper is enough greater? </p>
    *
    * <p> Test whether the Wrapper is enough greater than an Instance to contain. </p>
    *
    * @param instance An Instance to test.
    * @return Enough greater or not.
    */
  def containable(instance: Instance): Boolean = js.native
  /**
    * @inheritdoc
    */
  def createChild(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Wrap = js.native
  def equals(obj: Wrapper): Boolean = js.native
  /**
    * <p> Get (calculate) containable height, length on the Y-axis in 3D. </p>
    *
    * <p> Calculates containable height considering the {@link thickness}. </p>
    *
    * @return height - (2 x thickness)
    */
  def getContainableHeight(): Double = js.native
  /**
    * <p> Get (calculate) containable length, length on the Z-axis in 3D. </p>
    *
    * <p> Calculates containable length considering the {@link thickness}. </p>
    *
    * @return length - (2 x thickness)
    */
  def getContainableLength(): Double = js.native
  /**
    * <p> Get (calculate) containable volume. </p>
    *
    * <p> Calculates containable volume considering the {@link thickness}. </p>
    *
    * @return volume - {(2 x thickness) ^ 3}
    */
  def getContainableVolume(): Double = js.native
  /**
    * <p> Get (calculate) containable width, length on the X-axis in 3D. </p>
    *
    * <p> Calculates containable width considering the {@link thickness}. </p>
    *
    * @return width - (2 x thickness)
    */
  def getContainableWidth(): Double = js.native
  /**
    * Get price.
    */
  def getPrice(): Double = js.native
  /**
    * Get thickness.
    */
  def getThickness(): Double = js.native
  /**
    * Get utilization ratio of containable volume.
    *
    * @return utilization ratio.
    */
  def getUtilization(): Double = js.native
  /**
    * Key of a Wrapper is its name.
    */
  def key(): js.Any = js.native
  /**
    * Set price.
    */
  def setPrice(`val`: Double): Unit = js.native
  /**
    * Set thickness.
    */
  def setThickness(`val`: Double): Unit = js.native
  /**
    * @inheritdoc
    */
  def toXML(): js.Any = js.native
}

object Wrapper {
  @scala.inline
  def apply(
    $height: String,
    $length: String,
    $name: String,
    $price: String,
    $scale: String,
    $spaceUtilization: String,
    $thickness: String,
    $width: String,
    CHILD_TAG: () => String,
    TAG: () => String,
    TYPE: () => String,
    containable: Instance => Boolean,
    createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Wrap,
    equals: Wrapper => Boolean,
    getContainableHeight: () => Double,
    getContainableLength: () => Double,
    getContainableVolume: () => Double,
    getContainableWidth: () => Double,
    getHeight: () => Double,
    getLength: () => Double,
    getName: () => String,
    getPrice: () => Double,
    getThickness: () => Double,
    getUtilization: () => Double,
    getVolume: () => Double,
    getWidth: () => Double,
    height: Double,
    key: () => js.Any,
    length: Double,
    name: String,
    price: Double,
    setHeight: Double => Unit,
    setLength: Double => Unit,
    setName: String => Unit,
    setPrice: Double => Unit,
    setThickness: Double => Unit,
    setWidth: Double => Unit,
    thickness: Double,
    toXML: () => js.Any,
    width: Double
  ): Wrapper = {
    val __obj = js.Dynamic.literal($height = $height.asInstanceOf[js.Any], $length = $length.asInstanceOf[js.Any], $name = $name.asInstanceOf[js.Any], $price = $price.asInstanceOf[js.Any], $scale = $scale.asInstanceOf[js.Any], $spaceUtilization = $spaceUtilization.asInstanceOf[js.Any], $thickness = $thickness.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any], CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), TYPE = js.Any.fromFunction0(TYPE), containable = js.Any.fromFunction1(containable), createChild = js.Any.fromFunction1(createChild), equals = js.Any.fromFunction1(equals), getContainableHeight = js.Any.fromFunction0(getContainableHeight), getContainableLength = js.Any.fromFunction0(getContainableLength), getContainableVolume = js.Any.fromFunction0(getContainableVolume), getContainableWidth = js.Any.fromFunction0(getContainableWidth), getHeight = js.Any.fromFunction0(getHeight), getLength = js.Any.fromFunction0(getLength), getName = js.Any.fromFunction0(getName), getPrice = js.Any.fromFunction0(getPrice), getThickness = js.Any.fromFunction0(getThickness), getUtilization = js.Any.fromFunction0(getUtilization), getVolume = js.Any.fromFunction0(getVolume), getWidth = js.Any.fromFunction0(getWidth), height = height.asInstanceOf[js.Any], key = js.Any.fromFunction0(key), length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], setHeight = js.Any.fromFunction1(setHeight), setLength = js.Any.fromFunction1(setLength), setName = js.Any.fromFunction1(setName), setPrice = js.Any.fromFunction1(setPrice), setThickness = js.Any.fromFunction1(setThickness), setWidth = js.Any.fromFunction1(setWidth), thickness = thickness.asInstanceOf[js.Any], toXML = js.Any.fromFunction0(toXML), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrapper]
  }
  @scala.inline
  implicit class WrapperOps[Self <: Wrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$height(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$length(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$price(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$scale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$spaceUtilization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$spaceUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$thickness(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$width(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCHILD_TAG(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHILD_TAG")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTAG(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TAG")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContainable(value: Instance => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateChild(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Wrap
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquals(value: Wrapper => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetContainableHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainableHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContainableLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainableLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContainableVolume(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainableVolume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContainableWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainableWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPrice(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetThickness(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThickness")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUtilization(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUtilization")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetPrice(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrice")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetThickness(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThickness")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToXML(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toXML")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

