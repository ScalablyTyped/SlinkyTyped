package typingsSlinky.angularCore.ngComponentTemplateMod

import typingsSlinky.angularCore.anon.Character
import typingsSlinky.typescript.mod.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedTemplate extends js.Object {
  /** Class declaration that contains this template. */
  var container: ClassDeclaration = js.native
  /** File content of the given template. */
  var content: String = js.native
  /** Path to the file that contains this template. */
  var filePath: String = js.native
  /** Whether the given template is inline or not. */
  var `inline`: Boolean = js.native
  /** Start offset of the template content (e.g. in the inline source file) */
  var start: Double = js.native
  /**
    * Gets the character and line of a given position index in the template.
    * If the template is declared inline within a TypeScript source file, the line and
    * character are based on the full source file content.
    */
  def getCharacterAndLineOfPosition(pos: Double): Character = js.native
}

object ResolvedTemplate {
  @scala.inline
  def apply(
    container: ClassDeclaration,
    content: String,
    filePath: String,
    getCharacterAndLineOfPosition: Double => Character,
    `inline`: Boolean,
    start: Double
  ): ResolvedTemplate = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], getCharacterAndLineOfPosition = js.Any.fromFunction1(getCharacterAndLineOfPosition), start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedTemplate]
  }
  @scala.inline
  implicit class ResolvedTemplateOps[Self <: ResolvedTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: ClassDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCharacterAndLineOfPosition(value: Double => Character): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCharacterAndLineOfPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

