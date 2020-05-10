package typingsSlinky.rollupPluginTypescript2.ioptionsMod

import typingsSlinky.typescript.mod.Bundle
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.TransformationContext
import typingsSlinky.typescript.mod.Transformer
import typingsSlinky.typescript.mod.TransformerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomTransformer extends js.Object {
  var after: js.UndefOr[TransformerFactory[SourceFile]] = js.native
  var afterDeclarations: js.UndefOr[TransformerFactory[Bundle | SourceFile]] = js.native
  var before: js.UndefOr[TransformerFactory[SourceFile]] = js.native
}

object ICustomTransformer {
  @scala.inline
  def apply(): ICustomTransformer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomTransformer]
  }
  @scala.inline
  implicit class ICustomTransformerOps[Self <: ICustomTransformer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: /* context */ TransformationContext => Transformer[SourceFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDeclarations(value: /* context */ TransformationContext => Transformer[Bundle | SourceFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDeclarations")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterDeclarations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDeclarations")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: /* context */ TransformationContext => Transformer[SourceFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
  }
  
}

