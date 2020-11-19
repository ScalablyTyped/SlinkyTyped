package typingsSlinky.bagpipes

import typingsSlinky.bagpipes.mod.Affinity
import typingsSlinky.bagpipes.mod._FittingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bagpipesStrings {
  
  @scala.inline
  def hoist: hoist = "hoist".asInstanceOf[hoist]
  
  @scala.inline
  def sink: sink = "sink".asInstanceOf[sink]
  
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait hoist extends Affinity
  
  @js.native
  sealed trait sink extends Affinity
  
  @js.native
  sealed trait system extends _FittingType
  
  @js.native
  sealed trait user extends _FittingType
}
