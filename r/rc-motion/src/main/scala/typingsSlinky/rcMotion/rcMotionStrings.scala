package typingsSlinky.rcMotion

import typingsSlinky.rcMotion.diffMod.DiffStatus
import typingsSlinky.rcMotion.interfaceMod.MotionStatus
import typingsSlinky.rcMotion.interfaceMod.StepStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcMotionStrings {
  
  @js.native
  sealed trait active extends StepStatus
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait add extends DiffStatus
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait appear extends MotionStatus
  @scala.inline
  def appear: appear = "appear".asInstanceOf[appear]
  
  @js.native
  sealed trait end extends StepStatus
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait enter extends MotionStatus
  @scala.inline
  def enter: enter = "enter".asInstanceOf[enter]
  
  @js.native
  sealed trait keep extends DiffStatus
  @scala.inline
  def keep: keep = "keep".asInstanceOf[keep]
  
  @js.native
  sealed trait leave extends MotionStatus
  @scala.inline
  def leave: leave = "leave".asInstanceOf[leave]
  
  @js.native
  sealed trait none
    extends MotionStatus
       with StepStatus
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait prepare extends StepStatus
  @scala.inline
  def prepare: prepare = "prepare".asInstanceOf[prepare]
  
  @js.native
  sealed trait remove extends DiffStatus
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait removed extends DiffStatus
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait start extends StepStatus
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}
