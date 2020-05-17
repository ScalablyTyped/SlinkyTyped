package typingsSlinky.jsoneditoronline

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class JSONEditor protected ()
    extends typingsSlinky.jsoneditoronline.JSONEditor {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, options: JSONEditorOptions) = this()
    def this(container: HTMLElement, options: JSONEditorOptions, json: js.Any) = this()
  }
  
  @js.native
  class JSONEditorAppendNode protected ()
    extends typingsSlinky.jsoneditoronline.JSONEditorNode {
    def this(editor: typingsSlinky.jsoneditoronline.JSONEditor) = this()
  }
  
  @js.native
  class JSONEditorHistory protected ()
    extends typingsSlinky.jsoneditoronline.JSONEditorHistory {
    def this(editor: typingsSlinky.jsoneditoronline.JSONEditor) = this()
  }
  
  @js.native
  class JSONEditorNode protected ()
    extends typingsSlinky.jsoneditoronline.JSONEditorNode {
    def this(editor: typingsSlinky.jsoneditoronline.JSONEditor, params: JSONEditorConstructorParams) = this()
  }
  
  @js.native
  class JSONEditorSearchBox protected ()
    extends typingsSlinky.jsoneditoronline.JSONEditorSearchBox {
    def this(editor: typingsSlinky.jsoneditoronline.JSONEditor, container: HTMLElement) = this()
  }
  
  @js.native
  class JSONFormatter protected ()
    extends typingsSlinky.jsoneditoronline.JSONFormatter {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, options: JSONFormatterOptions) = this()
    def this(container: HTMLElement, options: JSONFormatterOptions, json: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object JSONEditor extends js.Object {
    var focusNode: typingsSlinky.jsoneditoronline.JSONEditorNode = js.native
    var freezeHighlight: Boolean = js.native
    def addClassName(elem: HTMLElement, className: String): Unit = js.native
    def getAbsoluteLeft(elem: HTMLElement): Double = js.native
    def getAbsoluteTop(elem: HTMLElement): Double = js.native
    def getInnerText(element: HTMLElement, buffer: JSONEditorBuffer): String = js.native
    def getInternetExplorerVersion(): Double = js.native
    def getNodeFromTarget(target: HTMLElement): typingsSlinky.jsoneditoronline.JSONEditorNode = js.native
    def parse(jsonString: String): js.Object = js.native
    def removeClassName(elem: HTMLElement, className: String): Unit = js.native
    def setEndOfContentEditable(contentEditableElement: HTMLElement): Unit = js.native
    def stripFormatting(divElement: HTMLElement): Unit = js.native
    def validate(jsonString: String): String = js.native
  }
  
}

