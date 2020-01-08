package typingsSlinky.prettier.prettierMod.doc.builders

import typingsSlinky.prettier.Anon_Root
import typingsSlinky.prettier.prettierStrings.`break-parent`
import typingsSlinky.prettier.prettierStrings.`if-break`
import typingsSlinky.prettier.prettierStrings.`line-suffix-boundary`
import typingsSlinky.prettier.prettierStrings.`line-suffix`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Doc extends js.Object

object _Doc {
  @scala.inline
  def BreakParent(`type`: `break-parent`): _Doc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def IfBreak(breakContents: Doc, flatContents: Doc, `type`: `if-break`): _Doc = {
    val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def LineSuffix(contents: Doc, `type`: `line-suffix`): _Doc = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Group(
    break: Boolean,
    contents: Doc,
    expandedStates: js.Array[Doc],
    `type`: typingsSlinky.prettier.prettierStrings.group
  ): _Doc = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Line(
    `type`: typingsSlinky.prettier.prettierStrings.line,
    hard: js.UndefOr[Boolean] = js.undefined,
    literal: js.UndefOr[Boolean] = js.undefined,
    soft: js.UndefOr[Boolean] = js.undefined
  ): _Doc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(hard)) __obj.updateDynamic("hard")(hard.asInstanceOf[js.Any])
    if (!js.isUndefined(literal)) __obj.updateDynamic("literal")(literal.asInstanceOf[js.Any])
    if (!js.isUndefined(soft)) __obj.updateDynamic("soft")(soft.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def LineSuffixBoundary(`type`: `line-suffix-boundary`): _Doc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Fill(parts: js.Array[Doc], `type`: typingsSlinky.prettier.prettierStrings.fill): _Doc = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Concat(parts: js.Array[Doc], `type`: typingsSlinky.prettier.prettierStrings.concat): _Doc = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Indent(contents: Doc, `type`: typingsSlinky.prettier.prettierStrings.indent): _Doc = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Align(
    contents: Doc,
    n: Double | String | Anon_Root,
    `type`: typingsSlinky.prettier.prettierStrings.align
  ): _Doc = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
}

