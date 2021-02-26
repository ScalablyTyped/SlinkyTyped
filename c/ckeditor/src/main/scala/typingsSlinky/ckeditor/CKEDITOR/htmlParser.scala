package typingsSlinky.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.anon.ApplyToAll
import typingsSlinky.ckeditor.anon.Option
import typingsSlinky.ckeditor.ckeditorBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlParser {
  
  @js.native
  trait basicWriter extends StObject {
    
    def attribute(attName: String, attValue: String): Unit = js.native
    
    def closeTag(tagName: String): Unit = js.native
    
    def comment(comment: String): Unit = js.native
    
    def getHtml(reset: Boolean): String = js.native
    
    def openTag(tagName: String, attributes: StringDictionary[String]): Unit = js.native
    
    def openTagClose(tagName: String, isSelfClose: Boolean): Unit = js.native
    
    def reset(): Unit = js.native
    
    def text(text: String): Unit = js.native
    
    def write(data: String): Unit = js.native
  }
  object basicWriter {
    
    @scala.inline
    def apply(
      attribute: (String, String) => Unit,
      closeTag: String => Unit,
      comment: String => Unit,
      getHtml: Boolean => String,
      openTag: (String, StringDictionary[String]) => Unit,
      openTagClose: (String, Boolean) => Unit,
      reset: () => Unit,
      text: String => Unit,
      write: String => Unit
    ): basicWriter = {
      val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction2(attribute), closeTag = js.Any.fromFunction1(closeTag), comment = js.Any.fromFunction1(comment), getHtml = js.Any.fromFunction1(getHtml), openTag = js.Any.fromFunction2(openTag), openTagClose = js.Any.fromFunction2(openTagClose), reset = js.Any.fromFunction0(reset), text = js.Any.fromFunction1(text), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[basicWriter]
    }
    
    @scala.inline
    implicit class basicWriterMutableBuilder[Self <: basicWriter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: (String, String) => Unit): Self = StObject.set(x, "attribute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCloseTag(value: String => Unit): Self = StObject.set(x, "closeTag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComment(value: String => Unit): Self = StObject.set(x, "comment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetHtml(value: Boolean => String): Self = StObject.set(x, "getHtml", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenTag(value: (String, StringDictionary[String]) => Unit): Self = StObject.set(x, "openTag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOpenTagClose(value: (String, Boolean) => Unit): Self = StObject.set(x, "openTagClose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setText(value: String => Unit): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait cdata extends node {
    
    var `type`: Double = js.native
    
    def writeHtml(writer: basicWriter): Unit = js.native
  }
  
  @js.native
  trait comment extends node {
    
    def filter(filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter): Boolean = js.native
    
    var `type`: Double = js.native
    
    var value: String = js.native
    
    def writeHtml(writer: basicWriter): Unit = js.native
    def writeHtml(writer: basicWriter, filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter): Unit = js.native
  }
  
  @js.native
  trait cssStyle extends StObject {
    
    def populate(obj: StringDictionary[js.Any]): Unit = js.native
    def populate(obj: typingsSlinky.ckeditor.CKEDITOR.dom.element): Unit = js.native
    def populate(obj: element): Unit = js.native
  }
  
  @js.native
  trait element extends node {
    
    def add(node: node): Unit = js.native
    def add(node: node, index: Double): Unit = js.native
    
    def addClass(className: String): Unit = js.native
    
    var attributes: StringDictionary[String] = js.native
    
    var children: js.Array[node] = js.native
    
    def filter(filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter): Boolean = js.native
    
    def filterChildren(filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter): Unit = js.native
    
    def find(criteria: String): js.Array[node] = js.native
    def find(criteria: String, recursive: Boolean): js.Array[node] = js.native
    def find(criteria: js.Function1[/* el */ node, Boolean]): js.Array[node] = js.native
    def find(criteria: js.Function1[/* el */ node, Boolean], recursive: Boolean): js.Array[node] = js.native
    
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`]): Unit = js.native
    @JSName("forEach")
    def forEach_false(
      callback: js.Function1[/* node */ node, Unit | `false`],
      `type`: js.UndefOr[scala.Nothing],
      skipRoot: Boolean
    ): Unit = js.native
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double): Unit = js.native
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double, skipRoot: Boolean): Unit = js.native
    
    def getFirst(condition: String): node = js.native
    def getFirst(condition: js.Function1[/* node */ node, Boolean]): node = js.native
    def getFirst(condition: StringDictionary[String]): node = js.native
    
    def getHtml(): String = js.native
    
    def getOuterHtml(): String = js.native
    
    def hasClass(className: String): Boolean = js.native
    
    var name: String = js.native
    
    def removeClass(className: String): Unit = js.native
    
    def replaceWithChildren(): Unit = js.native
    
    def setHtml(html: String): Unit = js.native
    
    def split(index: Double): element = js.native
    
    var `type`: Double = js.native
    
    def writeChildrenHtml(writer: basicWriter): Unit = js.native
    def writeChildrenHtml(writer: basicWriter, filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter): Unit = js.native
    
    def writeHtml(writer: basicWriter): Unit = js.native
    def writeHtml(writer: basicWriter, filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter): Unit = js.native
  }
  
  @js.native
  trait filter extends StObject {
    
    def addRules(rules: filterRulesDefinition): Unit = js.native
    def addRules(rules: filterRulesDefinition, options: Double): Unit = js.native
    def addRules(rules: filterRulesDefinition, options: ApplyToAll): Unit = js.native
    
    def applyTo(node: node): Unit = js.native
    
    var attributeNameRules: filterRulesGroup = js.native
    
    var attributesRules: StringDictionary[filterRulesGroup] = js.native
    
    var commentRules: filterRulesGroup = js.native
    
    var elementNameRules: filterRulesGroup = js.native
    
    var elementsRules: StringDictionary[filterRulesGroup] = js.native
    
    var id: Double = js.native
    
    var rootRules: filterRulesGroup = js.native
    
    var textRules: filterRulesGroup = js.native
  }
  
  @js.native
  trait filterRulesDefinition extends StObject {
    
    var attributeNames: js.UndefOr[js.Any] = js.native
    
    var attributes: js.UndefOr[js.Any] = js.native
    
    var comment: js.UndefOr[js.Any] = js.native
    
    var elementNames: js.UndefOr[js.Any] = js.native
    
    var elements: js.UndefOr[js.Any] = js.native
    
    var root: js.UndefOr[js.Any] = js.native
    
    var text: js.UndefOr[js.Any] = js.native
  }
  object filterRulesDefinition {
    
    @scala.inline
    def apply(): filterRulesDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[filterRulesDefinition]
    }
    
    @scala.inline
    implicit class filterRulesDefinitionMutableBuilder[Self <: filterRulesDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeNames(value: js.Any): Self = StObject.set(x, "attributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeNamesUndefined: Self = StObject.set(x, "attributeNames", js.undefined)
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setComment(value: js.Any): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setElementNames(value: js.Any): Self = StObject.set(x, "elementNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementNamesUndefined: Self = StObject.set(x, "elementNames", js.undefined)
      
      @scala.inline
      def setElements(value: js.Any): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      @scala.inline
      def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait filterRulesGroup extends StObject {
    
    def add(rule: rule, priority: Double, options: ruleOptions): Unit = js.native
    
    def addMany(rules: js.Array[StringDictionary[_]], priority: Double, options: ruleOptions): Unit = js.native
    
    def exec(currentValue: String): node | fragment | String = js.native
    def exec(currentValue: fragment): node | fragment | String = js.native
    def exec(currentValue: node): node | fragment | String = js.native
    
    def execOnName(currentName: String): String = js.native
    
    def findIndex(priority: Double): Double = js.native
    
    var rules: js.Array[Option] = js.native
  }
  
  @js.native
  trait fragment extends StObject {
    
    def add(node: node): Unit = js.native
    def add(node: node, index: Double): Unit = js.native
    
    var children: js.Array[node] = js.native
    
    def filter(filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter): Unit = js.native
    
    def filterChildren(filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter): Unit = js.native
    def filterChildren(filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter, filterRoot: Boolean): Unit = js.native
    
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`]): Unit = js.native
    @JSName("forEach")
    def forEach_false(
      callback: js.Function1[/* node */ node, Unit | `false`],
      `type`: js.UndefOr[scala.Nothing],
      skipRoot: Boolean
    ): Unit = js.native
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double): Unit = js.native
    @JSName("forEach")
    def forEach_false(callback: js.Function1[/* node */ node, Unit | `false`], `type`: Double, skipRoot: Boolean): Unit = js.native
    
    var parent: fragment = js.native
    
    val `type`: Double = js.native
    
    def writeChildrenHtml(writer: basicWriter): Unit = js.native
    def writeChildrenHtml(writer: basicWriter, filter: js.UndefOr[scala.Nothing], filterRoot: Boolean): Unit = js.native
    def writeChildrenHtml(writer: basicWriter, filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter): Unit = js.native
    def writeChildrenHtml(
      writer: basicWriter,
      filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter,
      filterRoot: Boolean
    ): Unit = js.native
    
    def writeHtml(writer: basicWriter): Unit = js.native
    def writeHtml(writer: basicWriter, filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter): Unit = js.native
  }
  
  @js.native
  trait node extends StObject {
    
    def getAscendant(condition: String): element = js.native
    def getAscendant(condition: js.Function1[/* node */ element, Boolean]): element = js.native
    def getAscendant(condition: StringDictionary[String]): element = js.native
    
    def getIndex(): Double = js.native
    
    def insertAfter(node: node): Unit = js.native
    
    def insertBefore(node: node): Unit = js.native
    
    def remove(): node = js.native
    
    def replaceWith(node: node): Unit = js.native
    
    def wrapWith(wrapper: element): element = js.native
  }
  
  type rule = (js.Function1[/* value */ node | fragment | String, Boolean]) | (js.Tuple2[String, String])
  
  @js.native
  trait ruleOptions extends StObject {
    
    var applyToAll: js.UndefOr[Boolean] = js.native
    
    var excludeNestedEditable: js.UndefOr[Boolean] = js.native
  }
  object ruleOptions {
    
    @scala.inline
    def apply(): ruleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ruleOptions]
    }
    
    @scala.inline
    implicit class ruleOptionsMutableBuilder[Self <: ruleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyToAll(value: Boolean): Self = StObject.set(x, "applyToAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyToAllUndefined: Self = StObject.set(x, "applyToAll", js.undefined)
      
      @scala.inline
      def setExcludeNestedEditable(value: Boolean): Self = StObject.set(x, "excludeNestedEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeNestedEditableUndefined: Self = StObject.set(x, "excludeNestedEditable", js.undefined)
    }
  }
  
  @js.native
  trait text extends node {
    
    def filter(filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter): Boolean = js.native
    
    var `type`: Double = js.native
    
    def writeHtml(writer: basicWriter): Unit = js.native
    def writeHtml(writer: basicWriter, filter: typingsSlinky.ckeditor.CKEDITOR.htmlParser.filter): Unit = js.native
  }
}
