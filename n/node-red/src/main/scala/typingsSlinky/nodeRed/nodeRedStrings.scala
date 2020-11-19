package typingsSlinky.nodeRed

import typingsSlinky.nodeRed.mod.StatusFill
import typingsSlinky.nodeRed.mod.StatusShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeRedStrings {
  
  @scala.inline
  def blue: blue = "blue".asInstanceOf[blue]
  
  @scala.inline
  def dot: dot = "dot".asInstanceOf[dot]
  
  @scala.inline
  def green: green = "green".asInstanceOf[green]
  
  @scala.inline
  def grey: grey = "grey".asInstanceOf[grey]
  
  @scala.inline
  def red: red = "red".asInstanceOf[red]
  
  @scala.inline
  def ring: ring = "ring".asInstanceOf[ring]
  
  @scala.inline
  def yellow: yellow = "yellow".asInstanceOf[yellow]
  
  @js.native
  sealed trait blue extends StatusFill
  
  @js.native
  sealed trait dot extends StatusShape
  
  @js.native
  sealed trait green extends StatusFill
  
  @js.native
  sealed trait grey extends StatusFill
  
  @js.native
  sealed trait red extends StatusFill
  
  @js.native
  sealed trait ring extends StatusShape
  
  @js.native
  sealed trait yellow extends StatusFill
}
