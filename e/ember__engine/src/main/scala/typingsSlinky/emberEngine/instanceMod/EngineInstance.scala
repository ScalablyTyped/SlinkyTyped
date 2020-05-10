package typingsSlinky.emberEngine.instanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : EmberObject.extend(RegistryProxyMixin, ContainerProxyMixin) * / any */ @js.native
trait EngineInstance extends js.Object {
  /**
    *  Initialize the `EngineInstance` and return a promise that resolves
    *  with the instance itself when the boot process is complete.
    */
  def boot(): js.Promise[EngineInstance] = js.native
  /**
    * Unregister a factory.
    */
  def unregister(fullName: String): js.Any = js.native
}

object EngineInstance {
  @scala.inline
  def apply(boot: () => js.Promise[EngineInstance], unregister: String => js.Any): EngineInstance = {
    val __obj = js.Dynamic.literal(boot = js.Any.fromFunction0(boot), unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[EngineInstance]
  }
  @scala.inline
  implicit class EngineInstanceOps[Self <: EngineInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoot(value: () => js.Promise[EngineInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnregister(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

