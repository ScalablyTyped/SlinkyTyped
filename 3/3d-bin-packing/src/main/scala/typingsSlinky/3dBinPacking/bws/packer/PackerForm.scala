package typingsSlinky.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bridge of {@link Packer} for {@link InstanceForm repeated instances}.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @js.native
trait PackerForm extends js.Object {
  /**
    * Form of Instances to pack.
    */
  var instanceFormArray: js.Any = js.native
  /**
    * Type of Wrappers to be used.
    */
  var wrapperArray: js.Any = js.native
  def TAG(): String = js.native
  def construct(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Unit = js.native
  def getInstanceFormArray(): InstanceFormArray = js.native
  def getWrapperArray(): WrapperArray = js.native
  def optimize(): WrapperArray = js.native
  def toPacker(): Packer = js.native
  def toXML(): js.Any = js.native
}

object PackerForm {
  @scala.inline
  def apply(
    TAG: () => String,
    construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit,
    getInstanceFormArray: () => InstanceFormArray,
    getWrapperArray: () => WrapperArray,
    instanceFormArray: js.Any,
    optimize: () => WrapperArray,
    toPacker: () => Packer,
    toXML: () => js.Any,
    wrapperArray: js.Any
  ): PackerForm = {
    val __obj = js.Dynamic.literal(TAG = js.Any.fromFunction0(TAG), construct = js.Any.fromFunction1(construct), getInstanceFormArray = js.Any.fromFunction0(getInstanceFormArray), getWrapperArray = js.Any.fromFunction0(getWrapperArray), instanceFormArray = instanceFormArray.asInstanceOf[js.Any], optimize = js.Any.fromFunction0(optimize), toPacker = js.Any.fromFunction0(toPacker), toXML = js.Any.fromFunction0(toXML), wrapperArray = wrapperArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackerForm]
  }
  @scala.inline
  implicit class PackerFormOps[Self <: PackerForm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withGetInstanceFormArray(value: () => InstanceFormArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstanceFormArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWrapperArray(value: () => WrapperArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWrapperArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstanceFormArray(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceFormArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimize(value: () => WrapperArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToPacker(value: () => Packer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPacker")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToXML(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toXML")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWrapperArray(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperArray")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

