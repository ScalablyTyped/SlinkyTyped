package typingsSlinky.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array of Instance objects.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityArray<Instance> * / any */ @js.native
trait InstanceArray extends js.Object {
  /**
    * @inheritdoc
    */
  def CHILD_TAG(): String = js.native
  /**
    * @inheritdoc
    */
  def TAG(): String = js.native
  /**
    * @inheritdoc
    */
  def createChild(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Instance = js.native
}

object InstanceArray {
  @scala.inline
  def apply(
    CHILD_TAG: () => String,
    TAG: () => String,
    createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Instance
  ): InstanceArray = {
    val __obj = js.Dynamic.literal(CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), createChild = js.Any.fromFunction1(createChild))
    __obj.asInstanceOf[InstanceArray]
  }
  @scala.inline
  implicit class InstanceArrayOps[Self <: InstanceArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCreateChild(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Instance
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createChild")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

