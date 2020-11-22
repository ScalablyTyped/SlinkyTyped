package typingsSlinky.reactOverlays.modalManagerMod

import typingsSlinky.reactOverlays.anon.HandleContainerOverflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Proper state management for containers and the modals in those containers.
  *
  * @internal Used by the Modal to ensure proper styling of containers.
  */
@JSImport("react-overlays/esm/ModalManager", JSImport.Default)
@js.native
class default () extends ModalManager {
  def this(hasHideSiblingNodesHandleContainerOverflow: HandleContainerOverflow) = this()
}
