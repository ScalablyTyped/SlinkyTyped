package typingsSlinky.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <p> Wrap represents an act wrap(ping). </p>
  *
  * <p> {@link Wrap} is a class represents an act wrapping an {@link Instance} to an {@link Wrapper}.
  * To represent the relationship, Wrap uses Bridge and Capsular patterns to links and intermediates
  * relationship between Wrapper and Instance. </p>
  *
  * <p> Wrap also helps packing optimization and 3d-visualization with its own members
  * {@link orientation} and position variables {@link x}, {@link y} and {@link z}. </p>
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @js.native
trait Wrap extends js.Object {
  @JSName("$instanceName")
  val $instanceName: String = js.native
  @JSName("$layoutScale")
  val $layoutScale: String = js.native
  @JSName("$position")
  val $position: String = js.native
  /**
    * An instance wrapped into the {@link wrapper}.
    */
  var instance: Instance = js.native
  /**
    * Placement orientation of wrapped {@link instance}.
    */
  var orientation: Double = js.native
  /**
    * A wrapper wrapping the {@link instance}.
    */
  var wrapper: Wrapper = js.native
  /**
    * Coordinate-X of the instance placement in the wrapper.
    */
  var x: Double = js.native
  /**
    * Coordinate-Y of the instance placement in the wrapper.
    */
  var y: Double = js.native
  /**
    * Coordinate-Z of the instance placement in the wrapper.
    */
  var z: Double = js.native
  /**
    * @inheritdoc
    */
  def TAG(): String = js.native
  /**
    * @brief Orientation change is occured in level of the packer.
    *
    * @details orientation Packer's new orientation.
    */
  def changeWrapperOrientation(orientation: Double): Unit = js.native
  /**
    * @inheritdoc
    */
  def construct(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Unit = js.native
  /**
    * Factory method of wrapped Instance.
    *
    * @param type Type of contained Instance's type.
    */
  /* protected */ def createInstance(`type`: String): Instance = js.native
  /**
    * @brief Estimate orientation by given size.
    *
    * @param width Width by placement.
    * @param height Height by placement.
    * @param length Length by placement.
    */
  def estimateOrientation(width: Double, height: Double, length: Double): Unit = js.native
  /**
    * Get instance.
    */
  def getInstance(): Instance = js.native
  /**
    * Get height.
    */
  def getLayoutHeight(): Double = js.native
  /**
    * Get width.
    */
  def getLayoutWidth(): Double = js.native
  /**
    * Get length.
    */
  def getLength(): Double = js.native
  /**
    * Get orientation.
    */
  def getOrientation(): Double = js.native
  /**
    * Get volume.
    */
  def getVolume(): Double = js.native
  /**
    * Get wrapper.
    */
  def getWrapper(): Wrapper = js.native
  /**
    * Get x.
    */
  def getX(): Double = js.native
  /**
    * Get y.
    */
  def getY(): Double = js.native
  /**
    * Get z.
    */
  def getZ(): Double = js.native
  /**
    * Set orientation.
    *
    * @param orientation Orientation code (1 to 6).
    */
  def setOrientation(orientation: Double): Unit = js.native
  /**
    * Set position.
    *
    * @param x Coordinate-X of the instance placement in the wrapper.
    * @param y Coordinate-Y of the instance placement in the wrapper.
    * @param z Coordinate-Z of the instance placement in the wrapper.
    */
  def setPosition(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * @inheritdoc
    */
  def toXML(): js.Any = js.native
}

object Wrap {
  @scala.inline
  def apply(
    $instanceName: String,
    $layoutScale: String,
    $position: String,
    TAG: () => String,
    changeWrapperOrientation: Double => Unit,
    construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit,
    createInstance: String => Instance,
    estimateOrientation: (Double, Double, Double) => Unit,
    getInstance: () => Instance,
    getLayoutHeight: () => Double,
    getLayoutWidth: () => Double,
    getLength: () => Double,
    getOrientation: () => Double,
    getVolume: () => Double,
    getWrapper: () => Wrapper,
    getX: () => Double,
    getY: () => Double,
    getZ: () => Double,
    instance: Instance,
    orientation: Double,
    setOrientation: Double => Unit,
    setPosition: (Double, Double, Double) => Unit,
    toXML: () => js.Any,
    wrapper: Wrapper,
    x: Double,
    y: Double,
    z: Double
  ): Wrap = {
    val __obj = js.Dynamic.literal($instanceName = $instanceName.asInstanceOf[js.Any], $layoutScale = $layoutScale.asInstanceOf[js.Any], $position = $position.asInstanceOf[js.Any], TAG = js.Any.fromFunction0(TAG), changeWrapperOrientation = js.Any.fromFunction1(changeWrapperOrientation), construct = js.Any.fromFunction1(construct), createInstance = js.Any.fromFunction1(createInstance), estimateOrientation = js.Any.fromFunction3(estimateOrientation), getInstance = js.Any.fromFunction0(getInstance), getLayoutHeight = js.Any.fromFunction0(getLayoutHeight), getLayoutWidth = js.Any.fromFunction0(getLayoutWidth), getLength = js.Any.fromFunction0(getLength), getOrientation = js.Any.fromFunction0(getOrientation), getVolume = js.Any.fromFunction0(getVolume), getWrapper = js.Any.fromFunction0(getWrapper), getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY), getZ = js.Any.fromFunction0(getZ), instance = instance.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], setOrientation = js.Any.fromFunction1(setOrientation), setPosition = js.Any.fromFunction3(setPosition), toXML = js.Any.fromFunction0(toXML), wrapper = wrapper.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrap]
  }
  @scala.inline
  implicit class WrapOps[Self <: Wrap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$instanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$instanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$layoutScale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$layoutScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$position(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTAG(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TAG")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChangeWrapperOrientation(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeWrapperOrientation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConstruct(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("construct")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateInstance(value: String => Instance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInstance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEstimateOrientation(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimateOrientation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetInstance(value: () => Instance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLayoutHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayoutHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLayoutWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayoutWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOrientation(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrientation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVolume(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVolume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWrapper(value: () => Wrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWrapper")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetZ(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZ")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstance(value: Instance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetOrientation(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOrientation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withToXML(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toXML")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWrapper(value: Wrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

