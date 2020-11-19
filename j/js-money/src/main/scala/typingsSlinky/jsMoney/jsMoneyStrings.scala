package typingsSlinky.jsMoney

import typingsSlinky.jsMoney.mod.Rounders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsMoneyStrings {
  
  @scala.inline
  def ceil: ceil = "ceil".asInstanceOf[ceil]
  
  @scala.inline
  def floor: floor = "floor".asInstanceOf[floor]
  
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait ceil extends Rounders
  
  @js.native
  sealed trait floor extends Rounders
  
  @js.native
  sealed trait round extends Rounders
}
