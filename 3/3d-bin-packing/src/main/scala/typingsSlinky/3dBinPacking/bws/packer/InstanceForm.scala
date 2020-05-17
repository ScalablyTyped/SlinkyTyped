package typingsSlinky.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <p> A repeated Instance. </p>
  *
  * <p> InstanceForm is an utility class for repeated {@link Instance}. It is designed for shrinking
  * volume of network message I/O by storing {@link count repeated count}. </p>
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @js.native
trait InstanceForm extends js.Object {
  @JSName("$count")
  var $count: String = js.native
  @JSName("$height")
  var $height: String = js.native
  @JSName("$length")
  var $length: String = js.native
  @JSName("$name")
  var $name: String = js.native
  @JSName("$width")
  var $width: String = js.native
  /**
    * Repeated count of the {@link instance}.
    */
  var count: js.Any = js.native
  /**
    * A duplicated Instance.
    */
  var instance: js.Any = js.native
  /**
    * @inheritdoc
    */
  def TAG(): String = js.native
  /**
    * @inheritdoc
    */
  def construct(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Unit = js.native
  /* private */ def createInstance(xml: js.Any): js.Any = js.native
  def getCount(): Double = js.native
  def getInstance(): Instance = js.native
  def key(): js.Any = js.native
  def setCount(`val`: Double): Unit = js.native
  /**
    * <p> Repeated {@link instance} to {@link InstanceArray}.
    *
    * @details
    * <p> Contains the {@link instance repeated instance} to an {@link InstanceArray} to make
    * {@link instance} to participate in the packing process. The returned {@link InstanceArray} will be
    * registered on {@link Packer.instanceArray}.
    *
    * @return An array of instance containing repeated {@link instance}.
    */
  def toInstanceArray(): InstanceArray = js.native
  /**
    * @inheritdoc
    */
  def toXML(): js.Any = js.native
}

object InstanceForm {
  @scala.inline
  def apply(
    $count: String,
    $height: String,
    $length: String,
    $name: String,
    $width: String,
    TAG: () => String,
    construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit,
    count: js.Any,
    createInstance: js.Any => js.Any,
    getCount: () => Double,
    getInstance: () => Instance,
    instance: js.Any,
    key: () => js.Any,
    setCount: Double => Unit,
    toInstanceArray: () => InstanceArray,
    toXML: () => js.Any
  ): InstanceForm = {
    val __obj = js.Dynamic.literal($count = $count.asInstanceOf[js.Any], $height = $height.asInstanceOf[js.Any], $length = $length.asInstanceOf[js.Any], $name = $name.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any], TAG = js.Any.fromFunction0(TAG), construct = js.Any.fromFunction1(construct), count = count.asInstanceOf[js.Any], createInstance = js.Any.fromFunction1(createInstance), getCount = js.Any.fromFunction0(getCount), getInstance = js.Any.fromFunction0(getInstance), instance = instance.asInstanceOf[js.Any], key = js.Any.fromFunction0(key), setCount = js.Any.fromFunction1(setCount), toInstanceArray = js.Any.fromFunction0(toInstanceArray), toXML = js.Any.fromFunction0(toXML))
    __obj.asInstanceOf[InstanceForm]
  }
  @scala.inline
  implicit class InstanceFormOps[Self <: InstanceForm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$count(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$count")(value.asInstanceOf[js.Any])
        ret
    }
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
    def with$width(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTAG(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TAG")(js.Any.fromFunction0(value))
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
    def withCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateInstance(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInstance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInstance(value: () => Instance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCount(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToInstanceArray(value: () => InstanceArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toInstanceArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToXML(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toXML")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

