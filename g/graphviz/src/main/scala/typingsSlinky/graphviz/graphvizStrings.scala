package typingsSlinky.graphviz

import typingsSlinky.graphviz.mod.RenderEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphvizStrings {
  
  @scala.inline
  def circo: circo = "circo".asInstanceOf[circo]
  
  @scala.inline
  def dot: dot = "dot".asInstanceOf[dot]
  
  @scala.inline
  def fdp: fdp = "fdp".asInstanceOf[fdp]
  
  @scala.inline
  def neato: neato = "neato".asInstanceOf[neato]
  
  @scala.inline
  def osage: osage = "osage".asInstanceOf[osage]
  
  @scala.inline
  def twopi: twopi = "twopi".asInstanceOf[twopi]
  
  @js.native
  sealed trait circo extends RenderEngine
  
  @js.native
  sealed trait dot extends RenderEngine
  
  @js.native
  sealed trait fdp extends RenderEngine
  
  @js.native
  sealed trait neato extends RenderEngine
  
  @js.native
  sealed trait osage extends RenderEngine
  
  @js.native
  sealed trait twopi extends RenderEngine
}
