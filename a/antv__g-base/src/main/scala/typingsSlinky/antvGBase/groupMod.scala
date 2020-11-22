package typingsSlinky.antvGBase

import typingsSlinky.antvGBase.containerMod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-base/lib/abstract/group", JSImport.Namespace)
@js.native
object groupMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.antvGBase.interfacesMod.IObservable because Already inherited
  - typingsSlinky.antvGBase.interfacesMod.IBase because Already inherited
  - typingsSlinky.antvGBase.interfacesMod.IElement because Already inherited
  - typingsSlinky.antvGBase.interfacesMod.IContainer because Already inherited
  - typingsSlinky.antvGBase.interfacesMod.IGroup because var conflicts: cfg, destroyed. Inlined isEntityGroup */ @js.native
  trait AbstractGroup extends Container {
    
    /**
      * 是否是实体分组，即对应实际的渲染元素
      * @return {boolean} 是否是实体分组
      */
    def isEntityGroup(): Boolean = js.native
  }
  
  @js.native
  abstract class default () extends AbstractGroup
}
