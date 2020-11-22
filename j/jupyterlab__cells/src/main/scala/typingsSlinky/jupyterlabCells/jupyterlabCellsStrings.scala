package typingsSlinky.jupyterlabCells

import typingsSlinky.jupyterlabCells.celldragutilsMod.CellDragUtils.ICellTargetArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabCellsStrings {
  
  @scala.inline
  def bounded: bounded = "bounded".asInstanceOf[bounded]
  
  @scala.inline
  def cell: cell = "cell".asInstanceOf[cell]
  
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  
  @scala.inline
  def markdown: markdown = "markdown".asInstanceOf[markdown]
  
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @scala.inline
  def on: on = "on".asInstanceOf[on]
  
  @scala.inline
  def prompt: prompt = "prompt".asInstanceOf[prompt]
  
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @scala.inline
  def wordWrapColumn: wordWrapColumn = "wordWrapColumn".asInstanceOf[wordWrapColumn]
  
  @js.native
  sealed trait bounded extends js.Object
  
  @js.native
  sealed trait cell extends ICellTargetArea
  
  @js.native
  sealed trait code extends js.Object
  
  @js.native
  sealed trait input extends ICellTargetArea
  
  @js.native
  sealed trait markdown extends js.Object
  
  @js.native
  sealed trait off extends js.Object
  
  @js.native
  sealed trait on extends js.Object
  
  @js.native
  sealed trait prompt extends ICellTargetArea
  
  @js.native
  sealed trait raw extends js.Object
  
  @js.native
  sealed trait unknown extends ICellTargetArea
  
  @js.native
  sealed trait wordWrapColumn extends js.Object
}
