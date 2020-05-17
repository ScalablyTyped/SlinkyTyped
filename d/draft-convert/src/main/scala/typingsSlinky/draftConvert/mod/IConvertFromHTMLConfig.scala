package typingsSlinky.draftConvert.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.draftConvert.anon.Data
import typingsSlinky.draftConvert.anon.Entity
import typingsSlinky.draftConvert.draftConvertBooleans.`false`
import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConvertFromHTMLConfig extends js.Object {
  // Block styles:
  var htmlToBlock: js.UndefOr[
    js.Function2[/* nodeName */ String, /* node */ HTMLElement, DraftBlockType | Data | `false`]
  ] = js.native
  // Html entities
  var htmlToEntity: js.UndefOr[
    js.Function6[
      /* nodeName */ String, 
      /* node */ HTMLElement, 
      /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], 
      /* getEntity */ js.Function1[
        /* key */ EntityKey, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
      ], 
      /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      Unit
    ]
  ] = js.native
  // Inline styles:
  var htmlToStyle: js.UndefOr[
    js.Function2[/* nodeName */ String, /* node */ HTMLElement, DraftInlineStyleType]
  ] = js.native
  // Text entities
  var textToEntity: js.UndefOr[
    js.Function5[
      /* text */ String, 
      /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], 
      /* getEntity */ js.Function1[
        /* key */ EntityKey, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
      ], 
      /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      js.Array[Entity]
    ]
  ] = js.native
}

object IConvertFromHTMLConfig {
  @scala.inline
  def apply(): IConvertFromHTMLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConvertFromHTMLConfig]
  }
  @scala.inline
  implicit class IConvertFromHTMLConfigOps[Self <: IConvertFromHTMLConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtmlToBlock(value: (/* nodeName */ String, /* node */ HTMLElement) => DraftBlockType | Data | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlToBlock")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHtmlToBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlToBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlToEntity(
      value: (/* nodeName */ String, /* node */ HTMLElement, /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], /* getEntity */ js.Function1[
          /* key */ EntityKey, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
        ], /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlToEntity")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutHtmlToEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlToEntity")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlToStyle(value: (/* nodeName */ String, /* node */ HTMLElement) => DraftInlineStyleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlToStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHtmlToStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlToStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextToEntity(
      value: (/* text */ String, /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], /* getEntity */ js.Function1[
          /* key */ EntityKey, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
        ], /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit]) => js.Array[Entity]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToEntity")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutTextToEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToEntity")(js.undefined)
        ret
    }
  }
  
}

