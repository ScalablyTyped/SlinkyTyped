package typingsSlinky.popmotionPose.typesMod

import org.scalajs.dom.raw.Element
import typingsSlinky.poseCore.typesMod.Poser
import typingsSlinky.poseCore.typesMod.PoserConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomPopmotionPoser
  extends Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      DomPopmotionPoser
    ] {
  
  def addChild(element: Element, config: PoserConfig[Value]): DomPopmotionPoser = js.native
  
  def flip(op: js.Function): js.Promise[_] = js.native
  
  def measure(): BoundingBox = js.native
}
