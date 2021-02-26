package typingsSlinky.contentfulManagement

import typingsSlinky.contentfulManagement.contentfulManagementStrings.Link
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryFieldsMod {
  
  @js.native
  trait Array extends _EntryFields {
    
    var items: Entry | Asset | js.Symbol = js.native
    
    var `type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Array = js.native
  }
  object Array {
    
    @scala.inline
    def apply(
      items: Entry | Asset | js.Symbol,
      `type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Array
    ): Array = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Array]
    }
    
    @scala.inline
    implicit class ArrayMutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: Entry | Asset | js.Symbol): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: typingsSlinky.contentfulManagement.contentfulManagementStrings.Array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Asset extends StObject {
    
    var linkType: typingsSlinky.contentfulManagement.contentfulManagementStrings.Asset = js.native
    
    var `type`: Link = js.native
  }
  object Asset {
    
    @scala.inline
    def apply(linkType: typingsSlinky.contentfulManagement.contentfulManagementStrings.Asset, `type`: Link): Asset = {
      val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Asset]
    }
    
    @scala.inline
    implicit class AssetMutableBuilder[Self <: Asset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkType(value: typingsSlinky.contentfulManagement.contentfulManagementStrings.Asset): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Boolean extends StObject {
    
    var `type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Boolean = js.native
  }
  object Boolean {
    
    @scala.inline
    def apply(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Boolean): Boolean = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Boolean]
    }
    
    @scala.inline
    implicit class BooleanMutableBuilder[Self <: Boolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typingsSlinky.contentfulManagement.contentfulManagementStrings.Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Date extends _EntryFields {
    
    var `type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Date = js.native
  }
  object Date {
    
    @scala.inline
    def apply(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Date): Date = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typingsSlinky.contentfulManagement.contentfulManagementStrings.Date): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Entry extends _EntryFields {
    
    var linkType: typingsSlinky.contentfulManagement.contentfulManagementStrings.Entry = js.native
    
    var `type`: Link = js.native
  }
  object Entry {
    
    @scala.inline
    def apply(linkType: typingsSlinky.contentfulManagement.contentfulManagementStrings.Entry, `type`: Link): Entry = {
      val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkType(value: typingsSlinky.contentfulManagement.contentfulManagementStrings.Entry): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - js.Symbol
    - typingsSlinky.contentfulManagement.entryFieldsMod.Text
    - typingsSlinky.contentfulManagement.entryFieldsMod.RichText
    - typingsSlinky.contentfulManagement.entryFieldsMod.Integer
    - scala.Double
    - typingsSlinky.contentfulManagement.entryFieldsMod.Date
    - scala.Boolean
    - typingsSlinky.std.Record[java.lang.String, js.Any]
    - typingsSlinky.contentfulManagement.entryFieldsMod.Location
    - typingsSlinky.contentfulManagement.entryFieldsMod.Entry
    - typingsSlinky.contentfulManagement.entryFieldsMod.Array
  */
  type EntryFields = _EntryFields | (Record[String, js.Any]) | js.Symbol | Double | scala.Boolean
  
  @js.native
  trait Integer extends _EntryFields {
    
    var `type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Integer = js.native
  }
  object Integer {
    
    @scala.inline
    def apply(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Integer): Integer = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Integer]
    }
    
    @scala.inline
    implicit class IntegerMutableBuilder[Self <: Integer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typingsSlinky.contentfulManagement.contentfulManagementStrings.Integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Location extends _EntryFields {
    
    var `type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Location = js.native
  }
  object Location {
    
    @scala.inline
    def apply(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Location): Location = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typingsSlinky.contentfulManagement.contentfulManagementStrings.Location): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Number extends StObject {
    
    var `type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Number = js.native
  }
  object Number {
    
    @scala.inline
    def apply(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Number): Number = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Number]
    }
    
    @scala.inline
    implicit class NumberMutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typingsSlinky.contentfulManagement.contentfulManagementStrings.Number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Object extends StObject {
    
    var `type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Object = js.native
  }
  object Object {
    
    @scala.inline
    def apply(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Object): Object = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Object]
    }
    
    @scala.inline
    implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typingsSlinky.contentfulManagement.contentfulManagementStrings.Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RichText extends _EntryFields {
    
    var `type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.RichText = js.native
  }
  object RichText {
    
    @scala.inline
    def apply(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.RichText): RichText = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RichText]
    }
    
    @scala.inline
    implicit class RichTextMutableBuilder[Self <: RichText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typingsSlinky.contentfulManagement.contentfulManagementStrings.RichText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Symbol extends StObject {
    
    var `type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Symbol = js.native
  }
  object Symbol {
    
    @scala.inline
    def apply(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Symbol): Symbol = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Symbol]
    }
    
    @scala.inline
    implicit class SymbolMutableBuilder[Self <: Symbol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typingsSlinky.contentfulManagement.contentfulManagementStrings.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Text extends _EntryFields {
    
    var `type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Text = js.native
  }
  object Text {
    
    @scala.inline
    def apply(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Text): Text = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: typingsSlinky.contentfulManagement.contentfulManagementStrings.Text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait _EntryFields extends StObject
  object _EntryFields {
    
    @scala.inline
    def Array(
      items: Entry | Asset | js.Symbol,
      `type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Array
    ): typingsSlinky.contentfulManagement.entryFieldsMod.Array = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.contentfulManagement.entryFieldsMod.Array]
    }
    
    @scala.inline
    def Date(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Date): typingsSlinky.contentfulManagement.entryFieldsMod.Date = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.contentfulManagement.entryFieldsMod.Date]
    }
    
    @scala.inline
    def Entry(linkType: typingsSlinky.contentfulManagement.contentfulManagementStrings.Entry, `type`: Link): typingsSlinky.contentfulManagement.entryFieldsMod.Entry = {
      val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.contentfulManagement.entryFieldsMod.Entry]
    }
    
    @scala.inline
    def Integer(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Integer): typingsSlinky.contentfulManagement.entryFieldsMod.Integer = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.contentfulManagement.entryFieldsMod.Integer]
    }
    
    @scala.inline
    def Location(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Location): typingsSlinky.contentfulManagement.entryFieldsMod.Location = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.contentfulManagement.entryFieldsMod.Location]
    }
    
    @scala.inline
    def RichText(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.RichText): typingsSlinky.contentfulManagement.entryFieldsMod.RichText = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.contentfulManagement.entryFieldsMod.RichText]
    }
    
    @scala.inline
    def Text(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Text): typingsSlinky.contentfulManagement.entryFieldsMod.Text = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.contentfulManagement.entryFieldsMod.Text]
    }
  }
}
