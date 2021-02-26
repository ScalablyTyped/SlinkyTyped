package typingsSlinky.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.fieldSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.ui")
@js.native
class ui protected ()
  extends typingsSlinky.ckeditor.CKEDITOR.ui {
  def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor) = this()
}
object ui {
  
  @JSGlobal("CKEDITOR.ui.balloonPanel")
  @js.native
  class balloonPanel ()
    extends typingsSlinky.ckeditor.CKEDITOR.ui.balloonPanel
  
  @JSGlobal("CKEDITOR.ui.balloonToolbar")
  @js.native
  class balloonToolbar protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.ui.balloonToolbar {
    def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, definition: StringDictionary[js.Any]) = this()
  }
  
  @JSGlobal("CKEDITOR.ui.button")
  @js.native
  class button protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.ui.button {
    def this(definition: StringDictionary[js.Any]) = this()
  }
  object button {
    
    /* static member */
    @JSGlobal("CKEDITOR.ui.button.handler")
    @js.native
    val handler: typingsSlinky.ckeditor.CKEDITOR.ui.handlerDefinition[typingsSlinky.ckeditor.CKEDITOR.ui.button] = js.native
  }
  
  object dialog {
    
    @JSGlobal("CKEDITOR.ui.dialog.button")
    @js.native
    class button protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.button {
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.button,
        htmlList: js.Array[_]
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.checkbox")
    @js.native
    class checkbox protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.checkbox {
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.checkbox,
        htmlList: js.Array[_]
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.fieldset")
    @js.native
    class fieldset protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.uiElement {
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        childObjList: js.Array[_],
        childHtmlList: js.Array[_],
        htmlList: js.Array[_],
        elementDefinition: fieldSet
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.file")
    @js.native
    class file protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.file {
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.file,
        htmlList: js.Array[_]
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.fileButton")
    @js.native
    class fileButton protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.button {
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.fileButton,
        htmlList: js.Array[_]
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.hbox")
    @js.native
    class hbox protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.hbox {
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        childObjList: js.Array[_],
        childHtmlList: js.Array[_],
        htmlList: js.Array[_],
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.hbox
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.html")
    @js.native
    class html protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.uiElement {
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.html,
        htmlList: js.Array[_]
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.iframeElement")
    @js.native
    class iframeElement ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.uiElement
    
    @JSGlobal("CKEDITOR.ui.dialog.labeledElement")
    @js.native
    class labeledElement protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.labeledElement {
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.labeledElement,
        htmlList: js.Array[_],
        contentHtml: js.Function0[String]
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.radio")
    @js.native
    class radio protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.radio {
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.radio,
        htmlList: js.Array[_]
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.select")
    @js.native
    class select protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.select {
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.select,
        htmlList: js.Array[_]
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.textInput")
    @js.native
    class textInput protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.textInput {
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.textInput,
        htmlList: js.Array[_]
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.textarea")
    @js.native
    class textarea protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.labeledElement {
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.textarea,
        htmlList: js.Array[_]
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.uiElement")
    @js.native
    class uiElement protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.uiElement {
      // Not sure that the htmlList array type is right.
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.Function0[String]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.UndefOr[scala.Nothing],
        stylesArg: js.Function0[StringDictionary[_]]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.Function0[String],
        stylesArg: js.Function0[StringDictionary[_]]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.UndefOr[scala.Nothing],
        stylesArg: js.UndefOr[scala.Nothing],
        attributesArg: js.Function0[StringDictionary[_]]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.UndefOr[scala.Nothing],
        stylesArg: js.Function0[StringDictionary[_]],
        attributesArg: js.Function0[StringDictionary[_]]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.Function0[String],
        stylesArg: js.UndefOr[scala.Nothing],
        attributesArg: js.Function0[StringDictionary[_]]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.Function0[String],
        stylesArg: js.Function0[StringDictionary[_]],
        attributesArg: js.Function0[StringDictionary[_]]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.UndefOr[scala.Nothing],
        stylesArg: js.UndefOr[scala.Nothing],
        attributesArg: js.UndefOr[scala.Nothing],
        contentsArg: js.Function0[StringDictionary[_] | String]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.UndefOr[scala.Nothing],
        stylesArg: js.UndefOr[scala.Nothing],
        attributesArg: js.Function0[StringDictionary[_]],
        contentsArg: js.Function0[StringDictionary[_] | String]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.UndefOr[scala.Nothing],
        stylesArg: js.Function0[StringDictionary[_]],
        attributesArg: js.UndefOr[scala.Nothing],
        contentsArg: js.Function0[StringDictionary[_] | String]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.UndefOr[scala.Nothing],
        stylesArg: js.Function0[StringDictionary[_]],
        attributesArg: js.Function0[StringDictionary[_]],
        contentsArg: js.Function0[StringDictionary[_] | String]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.Function0[String],
        stylesArg: js.UndefOr[scala.Nothing],
        attributesArg: js.UndefOr[scala.Nothing],
        contentsArg: js.Function0[StringDictionary[_] | String]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.Function0[String],
        stylesArg: js.UndefOr[scala.Nothing],
        attributesArg: js.Function0[StringDictionary[_]],
        contentsArg: js.Function0[StringDictionary[_] | String]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.Function0[String],
        stylesArg: js.Function0[StringDictionary[_]],
        attributesArg: js.UndefOr[scala.Nothing],
        contentsArg: js.Function0[StringDictionary[_] | String]
      ) = this()
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[_],
        nodeNameArg: js.Function0[String],
        stylesArg: js.Function0[StringDictionary[_]],
        attributesArg: js.Function0[StringDictionary[_]],
        contentsArg: js.Function0[StringDictionary[_] | String]
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.vbox")
    @js.native
    class vbox protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.dialog.hbox {
      def this(
        dialog: typingsSlinky.ckeditor.CKEDITOR.dialog,
        childObjList: js.Array[_],
        childHtmlList: js.Array[_],
        htmlList: js.Array[_],
        elementDefinition: typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions.vbox
      ) = this()
    }
  }
  
  @JSGlobal("CKEDITOR.ui.floatPanel")
  @js.native
  class floatPanel protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.ui.floatPanel {
    def this(
      editor: typingsSlinky.ckeditor.CKEDITOR.editor,
      parentElement: element,
      definition: StringDictionary[js.Any],
      level: Double
    ) = this()
  }
  
  @JSGlobal("CKEDITOR.ui.handlerDefinition")
  @js.native
  class handlerDefinition[T] ()
    extends typingsSlinky.ckeditor.CKEDITOR.ui.handlerDefinition[T]
  
  @JSGlobal("CKEDITOR.ui.menuButton")
  @js.native
  class menuButton ()
    extends typingsSlinky.ckeditor.CKEDITOR.ui.button
  
  @JSGlobal("CKEDITOR.ui.panel")
  @js.native
  class panel protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.ui.panel {
    def this(document: typingsSlinky.ckeditor.CKEDITOR.dom.document, definition: StringDictionary[js.Any]) = this()
  }
  object panel {
    
    @JSGlobal("CKEDITOR.ui.panel.block")
    @js.native
    class block ()
      extends typingsSlinky.ckeditor.CKEDITOR.ui.panel.block
    
    @JSGlobal("CKEDITOR.ui.panel.handler")
    @js.native
    val handler: typingsSlinky.ckeditor.CKEDITOR.ui.handlerDefinition[typingsSlinky.ckeditor.CKEDITOR.ui.panel] = js.native
  }
  
  @JSGlobal("CKEDITOR.ui.panelButton")
  @js.native
  class panelButton ()
    extends typingsSlinky.ckeditor.CKEDITOR.ui.button
  
  @JSGlobal("CKEDITOR.ui.richCombo")
  @js.native
  class richCombo ()
    extends typingsSlinky.ckeditor.CKEDITOR.ui.richCombo
  object richCombo {
    
    /* static member */
    @JSGlobal("CKEDITOR.ui.richCombo.handler")
    @js.native
    val handler: typingsSlinky.ckeditor.CKEDITOR.ui.handlerDefinition[typingsSlinky.ckeditor.CKEDITOR.ui.richCombo] = js.native
  }
}
