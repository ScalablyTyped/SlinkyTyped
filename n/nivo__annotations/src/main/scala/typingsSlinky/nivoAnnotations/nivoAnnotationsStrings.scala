package typingsSlinky.nivoAnnotations

import typingsSlinky.nivoAnnotations.mod.AnnotationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nivoAnnotationsStrings {
  
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  
  @scala.inline
  def dot: dot = "dot".asInstanceOf[dot]
  
  @scala.inline
  def rect: rect = "rect".asInstanceOf[rect]
  
  @js.native
  sealed trait circle extends AnnotationType
  
  @js.native
  sealed trait dot extends AnnotationType
  
  @js.native
  sealed trait rect extends AnnotationType
}
