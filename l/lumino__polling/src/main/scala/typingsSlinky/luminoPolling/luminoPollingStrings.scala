package typingsSlinky.luminoPolling

import typingsSlinky.luminoPolling.mod.IPoll._Phase
import typingsSlinky.luminoPolling.pollMod.Poll.Standby
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object luminoPollingStrings {
  
  @js.native
  sealed trait constructed
    extends _Phase[js.Any]
  @scala.inline
  def constructed: constructed = "constructed".asInstanceOf[constructed]
  
  @js.native
  sealed trait disposed
    extends _Phase[js.Any]
  @scala.inline
  def disposed: disposed = "disposed".asInstanceOf[disposed]
  
  @js.native
  sealed trait invoked extends StObject
  @scala.inline
  def invoked: invoked = "invoked".asInstanceOf[invoked]
  
  @js.native
  sealed trait leading extends StObject
  @scala.inline
  def leading: leading = "leading".asInstanceOf[leading]
  
  @js.native
  sealed trait never extends Standby
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait reconnected
    extends _Phase[js.Any]
  @scala.inline
  def reconnected: reconnected = "reconnected".asInstanceOf[reconnected]
  
  @js.native
  sealed trait refreshed
    extends _Phase[js.Any]
  @scala.inline
  def refreshed: refreshed = "refreshed".asInstanceOf[refreshed]
  
  @js.native
  sealed trait rejected
    extends _Phase[js.Any]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait resolved
    extends _Phase[js.Any]
  @scala.inline
  def resolved: resolved = "resolved".asInstanceOf[resolved]
  
  @js.native
  sealed trait standby
    extends _Phase[js.Any]
  @scala.inline
  def standby: standby = "standby".asInstanceOf[standby]
  
  @js.native
  sealed trait started
    extends _Phase[js.Any]
  @scala.inline
  def started: started = "started".asInstanceOf[started]
  
  @js.native
  sealed trait stopped
    extends _Phase[js.Any]
  @scala.inline
  def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait trailing extends StObject
  @scala.inline
  def trailing: trailing = "trailing".asInstanceOf[trailing]
  
  @js.native
  sealed trait `when-hidden` extends Standby
  @scala.inline
  def `when-hidden`: `when-hidden` = "when-hidden".asInstanceOf[`when-hidden`]
}
