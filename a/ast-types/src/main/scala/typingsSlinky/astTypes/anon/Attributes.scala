package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.JSXAttributeKind
import typingsSlinky.astTypes.kindsMod.JSXClosingElementKind
import typingsSlinky.astTypes.kindsMod.JSXElementKind
import typingsSlinky.astTypes.kindsMod.JSXExpressionContainerKind
import typingsSlinky.astTypes.kindsMod.JSXFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXMemberExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXNamespacedNameKind
import typingsSlinky.astTypes.kindsMod.JSXOpeningElementKind
import typingsSlinky.astTypes.kindsMod.JSXSpreadAttributeKind
import typingsSlinky.astTypes.kindsMod.JSXTextKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  var attributes: js.UndefOr[js.Array[JSXAttributeKind | JSXSpreadAttributeKind]] = js.native
  var children: js.UndefOr[
    js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ] = js.native
  var closingElement: js.UndefOr[JSXClosingElementKind | Null] = js.native
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  var name: js.UndefOr[JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind] = js.native
  var openingElement: JSXOpeningElementKind = js.native
  var selfClosing: js.UndefOr[Boolean] = js.native
}

object Attributes {
  @scala.inline
  def apply(openingElement: JSXOpeningElementKind): Attributes = {
    val __obj = js.Dynamic.literal(openingElement = openingElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpeningElement(value: JSXOpeningElementKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openingElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(
      value: js.Array[
          JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClosingElement(value: JSXClosingElementKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closingElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosingElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closingElement")(js.undefined)
        ret
    }
    @scala.inline
    def withClosingElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closingElement")(null)
        ret
    }
    @scala.inline
    def withComments(value: js.Array[CommentKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(null)
        ret
    }
    @scala.inline
    def withLoc(value: SourceLocationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(js.undefined)
        ret
    }
    @scala.inline
    def withLocNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(null)
        ret
    }
    @scala.inline
    def withName(value: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfClosing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosing")(js.undefined)
        ret
    }
  }
  
}

