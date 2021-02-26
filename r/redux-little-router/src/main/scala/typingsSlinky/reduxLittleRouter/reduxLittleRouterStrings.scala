package typingsSlinky.reduxLittleRouter

import typingsSlinky.reduxLittleRouter.mod.HistoryAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxLittleRouterStrings {
  
  @js.native
  sealed trait POP extends HistoryAction
  @scala.inline
  def POP: POP = "POP".asInstanceOf[POP]
  
  @js.native
  sealed trait PUSH extends HistoryAction
  @scala.inline
  def PUSH: PUSH = "PUSH".asInstanceOf[PUSH]
  
  @js.native
  sealed trait REPLACE extends HistoryAction
  @scala.inline
  def REPLACE: REPLACE = "REPLACE".asInstanceOf[REPLACE]
}
