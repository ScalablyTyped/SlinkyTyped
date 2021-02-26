package typingsSlinky.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.DataTransfer
import org.scalajs.dom.raw.Event
import typingsSlinky.ckeditor.CKEDITOR.dom.domObject
import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.dom.node
import typingsSlinky.ckeditor.CKEDITOR.dom.range
import typingsSlinky.ckeditor.CKEDITOR.pluginDefinition
import typingsSlinky.ckeditor.CKEDITOR.plugins.balloontoolbar.contextDefinition
import typingsSlinky.ckeditor.CKEDITOR.plugins.embedBase.baseDefinition
import typingsSlinky.ckeditor.CKEDITOR.plugins.imagebase.imageWidgetDefinition
import typingsSlinky.ckeditor.anon.Filter
import typingsSlinky.ckeditor.anon.Removed
import typingsSlinky.ckeditor.anon.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugins {
  
  @JSGlobal("CKEDITOR.plugins.add")
  @js.native
  def add(name: String): Unit = js.native
  @JSGlobal("CKEDITOR.plugins.add")
  @js.native
  def add(name: String, definition: pluginDefinition): Unit = js.native
  
  @JSGlobal("CKEDITOR.plugins.addExternal")
  @js.native
  def addExternal(name: String, path: String): Unit = js.native
  @JSGlobal("CKEDITOR.plugins.addExternal")
  @js.native
  def addExternal(name: String, path: String, fileName: String): Unit = js.native
  
  @JSGlobal("CKEDITOR.plugins.autoEmbed")
  @js.native
  class autoEmbed ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.autoEmbed
  
  object balloontoolbar {
    
    @JSGlobal("CKEDITOR.plugins.balloontoolbar.context")
    @js.native
    class context protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.balloontoolbar.context {
      def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, options: contextDefinition) = this()
    }
    
    @JSGlobal("CKEDITOR.plugins.balloontoolbar.contextManager")
    @js.native
    class contextManager protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.balloontoolbar.contextManager {
      def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor) = this()
    }
  }
  
  object clipboard {
    
    @JSGlobal("CKEDITOR.plugins.clipboard.addPasteButton")
    @js.native
    def addPasteButton(editor: typingsSlinky.ckeditor.CKEDITOR.editor, name: String, definition: StringDictionary[js.Any]): Unit = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.canClipboardApiBeTrusted")
    @js.native
    def canClipboardApiBeTrusted(
      dataTransfer: typingsSlinky.ckeditor.CKEDITOR.plugins.clipboard.dataTransfer,
      editor: typingsSlinky.ckeditor.CKEDITOR.editor
    ): Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.dataTransfer")
    @js.native
    class dataTransfer ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.clipboard.dataTransfer {
      def this(nativeDataTransfer: DataTransfer) = this()
      def this(nativeDataTransfer: js.UndefOr[scala.Nothing], editor: typingsSlinky.ckeditor.CKEDITOR.editor) = this()
      def this(nativeDataTransfer: DataTransfer, editor: typingsSlinky.ckeditor.CKEDITOR.editor) = this()
    }
    
    @JSGlobal("CKEDITOR.plugins.clipboard.fallbackDataTransfer")
    @js.native
    class fallbackDataTransfer protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.clipboard.fallbackDataTransfer {
      def this(dataTransfer: typingsSlinky.ckeditor.CKEDITOR.plugins.clipboard.dataTransfer) = this()
    }
    
    @JSGlobal("CKEDITOR.plugins.clipboard.getDropTarget")
    @js.native
    def getDropTarget(editor: typingsSlinky.ckeditor.CKEDITOR.editor): domObject = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.getRangeAtDropPosition")
    @js.native
    def getRangeAtDropPosition(domEvent: Event, editor: typingsSlinky.ckeditor.CKEDITOR.editor): range = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.initDragDataTransfer")
    @js.native
    def initDragDataTransfer(): Unit = js.native
    @JSGlobal("CKEDITOR.plugins.clipboard.initDragDataTransfer")
    @js.native
    def initDragDataTransfer(evt: js.UndefOr[scala.Nothing], editor: typingsSlinky.ckeditor.CKEDITOR.editor): Unit = js.native
    @JSGlobal("CKEDITOR.plugins.clipboard.initDragDataTransfer")
    @js.native
    def initDragDataTransfer(evt: typingsSlinky.ckeditor.CKEDITOR.dom.event): Unit = js.native
    @JSGlobal("CKEDITOR.plugins.clipboard.initDragDataTransfer")
    @js.native
    def initDragDataTransfer(evt: typingsSlinky.ckeditor.CKEDITOR.dom.event, editor: typingsSlinky.ckeditor.CKEDITOR.editor): Unit = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.initPasteDataTransfer")
    @js.native
    def initPasteDataTransfer(): Unit = js.native
    @JSGlobal("CKEDITOR.plugins.clipboard.initPasteDataTransfer")
    @js.native
    def initPasteDataTransfer(evt: js.UndefOr[scala.Nothing], sourceEditor: typingsSlinky.ckeditor.CKEDITOR.editor): Unit = js.native
    @JSGlobal("CKEDITOR.plugins.clipboard.initPasteDataTransfer")
    @js.native
    def initPasteDataTransfer(evt: typingsSlinky.ckeditor.CKEDITOR.dom.event): Unit = js.native
    @JSGlobal("CKEDITOR.plugins.clipboard.initPasteDataTransfer")
    @js.native
    def initPasteDataTransfer(
      evt: typingsSlinky.ckeditor.CKEDITOR.dom.event,
      sourceEditor: typingsSlinky.ckeditor.CKEDITOR.editor
    ): Unit = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.isCustomCopyCutSupported")
    @js.native
    val isCustomCopyCutSupported: Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.isCustomDataTypesSupported")
    @js.native
    val isCustomDataTypesSupported: Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.isFileApiSupported")
    @js.native
    val isFileApiSupported: Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.mainPasteEvent")
    @js.native
    val mainPasteEvent: String = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.preventDefaultDropOnElement")
    @js.native
    def preventDefaultDropOnElement(element: element): Unit = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.resetDragDataTransfer")
    @js.native
    def resetDragDataTransfer(): Unit = js.native
  }
  
  object cloudservices {
    
    @JSGlobal("CKEDITOR.plugins.cloudservices.cloudServicesLoader")
    @js.native
    class cloudServicesLoader protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.cloudservices.cloudServicesLoader {
      def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, fileOrData: String) = this()
      def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, fileOrData: Blob) = this()
      def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, fileOrData: String, fileName: String) = this()
      def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, fileOrData: Blob, fileName: String) = this()
      def this(
        editor: typingsSlinky.ckeditor.CKEDITOR.editor,
        fileOrData: String,
        fileName: js.UndefOr[scala.Nothing],
        token: String
      ) = this()
      def this(
        editor: typingsSlinky.ckeditor.CKEDITOR.editor,
        fileOrData: String,
        fileName: String,
        token: String
      ) = this()
      def this(
        editor: typingsSlinky.ckeditor.CKEDITOR.editor,
        fileOrData: Blob,
        fileName: js.UndefOr[scala.Nothing],
        token: String
      ) = this()
      def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, fileOrData: Blob, fileName: String, token: String) = this()
    }
  }
  
  object condesnippet {
    
    @JSGlobal("CKEDITOR.plugins.condesnippet.highlighter")
    @js.native
    class highlighter ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.condesnippet.highlighter
    
    @JSGlobal("CKEDITOR.plugins.condesnippet.setHighlighter")
    @js.native
    def setHighlighter(highlighter: typingsSlinky.ckeditor.CKEDITOR.plugins.condesnippet.highlighter): Unit = js.native
  }
  
  @JSGlobal("CKEDITOR.plugins.contextMenu")
  @js.native
  class contextMenu protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.contextMenu {
    def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor) = this()
  }
  
  object copyformatting {
    
    @JSGlobal("CKEDITOR.plugins.copyformatting")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.breakOnElements")
    @js.native
    def breakOnElements: js.Array[String] = js.native
    @scala.inline
    def breakOnElements_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("breakOnElements")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.elementsForInlineTransform")
    @js.native
    def elementsForInlineTransform: js.Array[String] = js.native
    @scala.inline
    def elementsForInlineTransform_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elementsForInlineTransform")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.excludedAttributes")
    @js.native
    def excludedAttributes: js.Array[String] = js.native
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.excludedAttributesFromInlineTransform")
    @js.native
    def excludedAttributesFromInlineTransform: js.Array[String] = js.native
    @scala.inline
    def excludedAttributesFromInlineTransform_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludedAttributesFromInlineTransform")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def excludedAttributes_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludedAttributes")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.inlineBoundary")
    @js.native
    def inlineBoundary: js.Array[String] = js.native
    @scala.inline
    def inlineBoundary_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineBoundary")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.preservedElements")
    @js.native
    def preservedElements: js.Array[String] = js.native
    @scala.inline
    def preservedElements_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preservedElements")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.state")
    @js.native
    class state protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.copyformatting.state {
      def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor) = this()
    }
  }
  
  object embedBase {
    
    @JSGlobal("CKEDITOR.plugins.embedBase.createWidgetBaseDefinition")
    @js.native
    def createWidgetBaseDefinition(editor: typingsSlinky.ckeditor.CKEDITOR.editor): baseDefinition = js.native
  }
  
  @JSGlobal("CKEDITOR.plugins.get")
  @js.native
  def get(name: String): js.Any = js.native
  
  @JSGlobal("CKEDITOR.plugins.getFilePath")
  @js.native
  def getFilePath(name: String): String = js.native
  
  @JSGlobal("CKEDITOR.plugins.getPath")
  @js.native
  def getPath(name: String): String = js.native
  
  object image2 {
    
    @JSGlobal("CKEDITOR.plugins.image2.checkHasNaturalRatio")
    @js.native
    def checkHasNaturalRatio(image: element): Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.image2.getLinkAttributesGetter")
    @js.native
    def getLinkAttributesGetter(): js.Function2[
        /* editor */ typingsSlinky.ckeditor.CKEDITOR.editor, 
        /* data */ StringDictionary[String], 
        Removed
      ] = js.native
    
    @JSGlobal("CKEDITOR.plugins.image2.getLinkAttributesParser")
    @js.native
    def getLinkAttributesParser(): js.Function2[
        /* editor */ typingsSlinky.ckeditor.CKEDITOR.editor, 
        /* element */ element, 
        StringDictionary[String]
      ] = js.native
    
    @JSGlobal("CKEDITOR.plugins.image2.getNatural")
    @js.native
    def getNatural(image: element): StringDictionary[String] = js.native
  }
  
  object imagebase {
    
    @JSGlobal("CKEDITOR.plugins.imagebase.addFeature")
    @js.native
    def addFeature(editor: typingsSlinky.ckeditor.CKEDITOR.editor, name: String, definition: imageWidgetDefinition): imageWidgetDefinition = js.native
    
    @JSGlobal("CKEDITOR.plugins.imagebase.addImageWidget")
    @js.native
    def addImageWidget(editor: typingsSlinky.ckeditor.CKEDITOR.editor, name: String, definition: imageWidgetDefinition): Unit = js.native
    
    @JSGlobal("CKEDITOR.plugins.imagebase.progressBar")
    @js.native
    class progressBar ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.imagebase.progressBar
    
    @JSGlobal("CKEDITOR.plugins.imagebase.progressReporter")
    @js.native
    class progressReporter ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.imagebase.progressReporter {
      def this(wrapperHtml: String) = this()
    }
  }
  
  object indent {
    
    @JSGlobal("CKEDITOR.plugins.indent.genericDefinition")
    @js.native
    class genericDefinition ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.indent.genericDefinition
    
    @JSGlobal("CKEDITOR.plugins.indent.registerCommands")
    @js.native
    def registerCommands(
      editor: typingsSlinky.ckeditor.CKEDITOR.editor,
      commands: StringDictionary[typingsSlinky.ckeditor.CKEDITOR.command]
    ): Unit = js.native
    
    @JSGlobal("CKEDITOR.plugins.indent.specificDefinition")
    @js.native
    class specificDefinition ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.indent.specificDefinition
  }
  
  object indentList {
    
    @JSGlobal("CKEDITOR.plugins.indentList.firstItemInPath")
    @js.native
    def firstItemInPath(query: String): Boolean = js.native
    @JSGlobal("CKEDITOR.plugins.indentList.firstItemInPath")
    @js.native
    def firstItemInPath(query: js.Array[String]): Boolean = js.native
    @JSGlobal("CKEDITOR.plugins.indentList.firstItemInPath")
    @js.native
    def firstItemInPath(query: js.Function1[/* element */ element, Boolean]): Boolean = js.native
    @JSGlobal("CKEDITOR.plugins.indentList.firstItemInPath")
    @js.native
    def firstItemInPath(query: StringDictionary[js.Any]): Boolean = js.native
    @JSGlobal("CKEDITOR.plugins.indentList.firstItemInPath")
    @js.native
    def firstItemInPath(query: element): Boolean = js.native
  }
  
  object link {
    
    // DEPRECATED 4.3.3
    @JSGlobal("CKEDITOR.plugins.link.emptyAnchorFix")
    @js.native
    val emptyAnchorFix: Boolean = js.native
    
    // DEPRECATED 4.3.3
    @JSGlobal("CKEDITOR.plugins.link.fakeAnchor")
    @js.native
    val fakeAnchor: Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.link.getEditorAnchors")
    @js.native
    def getEditorAnchors(editor: typingsSlinky.ckeditor.CKEDITOR.editor): js.Array[element] = js.native
    
    @JSGlobal("CKEDITOR.plugins.link.getLinkAttributes")
    @js.native
    def getLinkAttributes(editor: typingsSlinky.ckeditor.CKEDITOR.editor, data: StringDictionary[js.Any]): Set = js.native
    
    @JSGlobal("CKEDITOR.plugins.link.getSelectedLink")
    @js.native
    def getSelectedLink(editor: typingsSlinky.ckeditor.CKEDITOR.editor): element | js.Array[element] = js.native
    @JSGlobal("CKEDITOR.plugins.link.getSelectedLink")
    @js.native
    def getSelectedLink(editor: typingsSlinky.ckeditor.CKEDITOR.editor, returnMultiple: Boolean): element | js.Array[element] = js.native
    
    @JSGlobal("CKEDITOR.plugins.link.parseLinkAttributes")
    @js.native
    def parseLinkAttributes(editor: typingsSlinky.ckeditor.CKEDITOR.editor, element: element): StringDictionary[js.Any] = js.native
    
    @JSGlobal("CKEDITOR.plugins.link.showDisplayTextForElement")
    @js.native
    def showDisplayTextForElement(element: element, editor: typingsSlinky.ckeditor.CKEDITOR.editor): Boolean = js.native
    
    // DEPRECATED 4.3.3
    @JSGlobal("CKEDITOR.plugins.link.synAnchorSelector")
    @js.native
    val synAnchorSelector: Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.link.tryRestoreFakeAnchor")
    @js.native
    def tryRestoreFakeAnchor(editor: typingsSlinky.ckeditor.CKEDITOR.editor, element: element): element = js.native
  }
  
  @JSGlobal("CKEDITOR.plugins.list")
  @js.native
  class list ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.list
  
  @JSGlobal("CKEDITOR.plugins.load")
  @js.native
  def load(name: String, callback: js.Function1[/* plugins */ js.Array[String], Unit]): Unit = js.native
  @JSGlobal("CKEDITOR.plugins.load")
  @js.native
  def load(
    name: String,
    callback: js.Function1[/* plugins */ js.Array[String], Unit],
    scope: StringDictionary[js.Any]
  ): Unit = js.native
  
  @JSGlobal("CKEDITOR.plugins.notification")
  @js.native
  class notification protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.notification {
    def this(
      editor: typingsSlinky.ckeditor.CKEDITOR.editor,
      options: typingsSlinky.ckeditor.CKEDITOR.plugins.notification.options
    ) = this()
  }
  
  @JSGlobal("CKEDITOR.plugins.notificationAggregator")
  @js.native
  class notificationAggregator protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.notificationAggregator {
    def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, message: String) = this()
    def this(editor: typingsSlinky.ckeditor.CKEDITOR.editor, message: String, singularMessage: String) = this()
  }
  object notificationAggregator {
    
    @JSGlobal("CKEDITOR.plugins.notificationAggregator.task")
    @js.native
    class task ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.notificationAggregator.task {
      def this(weight: Double) = this()
    }
  }
  
  object pastefromword {
    
    @JSGlobal("CKEDITOR.plugins.pastefromword.lists")
    @js.native
    class lists ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.pastefromword.lists
    object lists {
      
      @JSGlobal("CKEDITOR.plugins.pastefromword.lists.numbering")
      @js.native
      class numbering ()
        extends typingsSlinky.ckeditor.CKEDITOR.plugins.pastefromword.lists.numbering
    }
    
    @JSGlobal("CKEDITOR.plugins.pastefromword.styles")
    @js.native
    class styles ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.pastefromword.styles
  }
  
  @JSGlobal("CKEDITOR.plugins.setLang")
  @js.native
  def setLang(pluginName: String, languageCode: String, languageEntries: js.Any): Unit = js.native
  
  object tableselection {
    
    @JSGlobal("CKEDITOR.plugins.tableselection.getCellsBetween")
    @js.native
    def getCellsBetween(first: element, last: element): js.Array[element] = js.native
  }
  
  @JSGlobal("CKEDITOR.plugins.widget")
  @js.native
  class widget protected ()
    extends typingsSlinky.ckeditor.CKEDITOR.plugins.widget {
    def this(
      widgetsRepo: typingsSlinky.ckeditor.CKEDITOR.plugins.widget.repository,
      id: Double,
      element: typingsSlinky.ckeditor.CKEDITOR.dom.element,
      widgetDef: typingsSlinky.ckeditor.CKEDITOR.plugins.widget.definition
    ) = this()
    def this(
      widgetsRepo: typingsSlinky.ckeditor.CKEDITOR.plugins.widget.repository,
      id: Double,
      element: typingsSlinky.ckeditor.CKEDITOR.dom.element,
      widgetDef: typingsSlinky.ckeditor.CKEDITOR.plugins.widget.definition,
      starupData: js.Any
    ) = this()
  }
  object widget {
    
    @JSGlobal("CKEDITOR.plugins.widget")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CKEDITOR.plugins.widget.WRAPPER_CLASS_PREFIX")
    @js.native
    def WRAPPER_CLASS_PREFIX: String = js.native
    @scala.inline
    def WRAPPER_CLASS_PREFIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WRAPPER_CLASS_PREFIX")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.widget.getNestedEditable")
    @js.native
    def getNestedEditable(guard: element, node: node): element = js.native
    
    @JSGlobal("CKEDITOR.plugins.widget.isDomDragHandler")
    @js.native
    def isDomDragHandler(node: node): Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.widget.isDomDragHandlerContainer")
    @js.native
    def isDomDragHandlerContainer(node: node): Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.widget.isDomNestedEditable")
    @js.native
    def isDomNestedEditable(node: node): Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.widget.isDomWidget")
    @js.native
    def isDomWidget(node: node): Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.widget.isDomWidgetElement")
    @js.native
    def isDomWidgetElement(node: node): Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.widget.isDomWidgetWrapper")
    @js.native
    def isDomWidgetWrapper(node: node): Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.widget.isParserWidgetElement")
    @js.native
    def isParserWidgetElement(node: node): Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.widget.isParserWidgetWrapper")
    @js.native
    def isParserWidgetWrapper(node: node): Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.widget.nestedEditable")
    @js.native
    class nestedEditable protected ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.widget.nestedEditable {
      def this(
        editor: typingsSlinky.ckeditor.CKEDITOR.editor,
        element: typingsSlinky.ckeditor.CKEDITOR.dom.element,
        config: Filter
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.plugins.widget.repository")
    @js.native
    class repository ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.widget.repository
    
    @JSGlobal("CKEDITOR.plugins.widget.widgetselection")
    @js.native
    class widgetselection ()
      extends typingsSlinky.ckeditor.CKEDITOR.plugins.widget.widgetselection
  }
}
