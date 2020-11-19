package typingsSlinky.reduxPack

import typingsSlinky.reduxPack.mod.LIFECYCLEValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxPackStrings {
  
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  
  @scala.inline
  def `redux-packSlashLIFECYCLE`: `redux-packSlashLIFECYCLE` = "redux-pack/LIFECYCLE".asInstanceOf[`redux-packSlashLIFECYCLE`]
  
  @scala.inline
  def `redux-packSlashTRANSACTION`: `redux-packSlashTRANSACTION` = "redux-pack/TRANSACTION".asInstanceOf[`redux-packSlashTRANSACTION`]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait failure extends LIFECYCLEValues
  
  @js.native
  sealed trait `redux-packSlashLIFECYCLE` extends js.Object
  
  @js.native
  sealed trait `redux-packSlashTRANSACTION` extends js.Object
  
  @js.native
  sealed trait start extends LIFECYCLEValues
  
  @js.native
  sealed trait success extends LIFECYCLEValues
}
