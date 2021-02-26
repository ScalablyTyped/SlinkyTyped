package typingsSlinky.opentok

import typingsSlinky.opentok.mod.ArchiveMode
import typingsSlinky.opentok.mod.ArchiveStatus
import typingsSlinky.opentok.mod.MediaMode
import typingsSlinky.opentok.mod.OutputMode
import typingsSlinky.opentok.mod.Role
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opentokStrings {
  
  @js.native
  sealed trait always extends ArchiveMode
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait available extends ArchiveStatus
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  
  @js.native
  sealed trait bestFit extends StObject
  @scala.inline
  def bestFit: bestFit = "bestFit".asInstanceOf[bestFit]
  
  @js.native
  sealed trait composed extends OutputMode
  @scala.inline
  def composed: composed = "composed".asInstanceOf[composed]
  
  @js.native
  sealed trait custom extends StObject
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait expired extends ArchiveStatus
  @scala.inline
  def expired: expired = "expired".asInstanceOf[expired]
  
  @js.native
  sealed trait failed extends ArchiveStatus
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait horizontalPresentation extends StObject
  @scala.inline
  def horizontalPresentation: horizontalPresentation = "horizontalPresentation".asInstanceOf[horizontalPresentation]
  
  @js.native
  sealed trait individual extends OutputMode
  @scala.inline
  def individual: individual = "individual".asInstanceOf[individual]
  
  @js.native
  sealed trait manual extends ArchiveMode
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait moderator extends Role
  @scala.inline
  def moderator: moderator = "moderator".asInstanceOf[moderator]
  
  @js.native
  sealed trait paused extends ArchiveStatus
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait pip extends StObject
  @scala.inline
  def pip: pip = "pip".asInstanceOf[pip]
  
  @js.native
  sealed trait publisher extends Role
  @scala.inline
  def publisher: publisher = "publisher".asInstanceOf[publisher]
  
  @js.native
  sealed trait relayed extends MediaMode
  @scala.inline
  def relayed: relayed = "relayed".asInstanceOf[relayed]
  
  @js.native
  sealed trait routed extends MediaMode
  @scala.inline
  def routed: routed = "routed".asInstanceOf[routed]
  
  @js.native
  sealed trait started extends ArchiveStatus
  @scala.inline
  def started: started = "started".asInstanceOf[started]
  
  @js.native
  sealed trait stopped extends ArchiveStatus
  @scala.inline
  def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait subscriber extends Role
  @scala.inline
  def subscriber: subscriber = "subscriber".asInstanceOf[subscriber]
  
  @js.native
  sealed trait uploaded extends ArchiveStatus
  @scala.inline
  def uploaded: uploaded = "uploaded".asInstanceOf[uploaded]
  
  @js.native
  sealed trait verticalPresentation extends StObject
  @scala.inline
  def verticalPresentation: verticalPresentation = "verticalPresentation".asInstanceOf[verticalPresentation]
}
