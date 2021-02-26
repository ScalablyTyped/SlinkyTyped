package typingsSlinky.openfin

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openfin.anon.BBG
import typingsSlinky.openfin.anon.Dictkey
import typingsSlinky.openfin.anon.LEI
import typingsSlinky.openfin.openfinStrings.fdc3Dotcontact
import typingsSlinky.openfin.openfinStrings.fdc3Dotinstrument
import typingsSlinky.openfin.openfinStrings.fdc3Dotorganization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @js.native
  trait ContactContext extends Context {
    
    /**
      * The contact data. Can contain some or all of:
      * * `email`: Email address
      * * `twitter`: Twitter handle
      * * `phone`: Phone number
      */
    @JSName("id")
    var id_ContactContext: Dictkey = js.native
    
    /**
      * Free text name of the contact.
      */
    @JSName("name")
    var name_ContactContext: String = js.native
    
    /**
      * The context type is always 'fdc3.contact'.
      */
    @JSName("type")
    var type_ContactContext: fdc3Dotcontact = js.native
  }
  object ContactContext {
    
    @scala.inline
    def apply(id: Dictkey, name: String, `type`: fdc3Dotcontact): ContactContext = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContactContext]
    }
    
    @scala.inline
    implicit class ContactContextMutableBuilder[Self <: ContactContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Dictkey): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: fdc3Dotcontact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Context
    extends /**
    * @hidden
    * Custom properties and metadata. This can be extended in specific context object.
    */
  /* key */ StringDictionary[js.Any] {
    
    /**
      * An optional map of any equivalent identifiers for the context type, e.g. ISIN, CUSIP, etc. for an instrument.
      */
    var id: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
    
    /**
      * The name of the context data (optional). This is a text string that describes the data being sent.
      * Implementors of context may choose to make the name mandatory.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The type of the context that uniquely identifies it, e.g. "fdc3.instrument".
      * This is used to refer to the accepted context(s) when declaring intents. See [[AppDirIntent]].
      */
    var `type`: String = js.native
  }
  object Context {
    
    @scala.inline
    def apply(`type`: String): Context = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InstrumentContext extends Context {
    
    /**
      * The instrument data. Can contain some or all of:
      * * `ticker`: a ticker
      * * `ISIN`: [ISIN](https://www.isin.org/isin/)
      * * `CUSIP`: [CUSIP](https://www.cusip.com/cusip/index.htm)
      * * `SEDOL`: [SEDOL](https://www.londonstockexchange.com/products-and-services/reference-data/sedol-master-file/sedol-master-file.htm)
      * * `RIC`: [Reuters Instrument Code (RIC)](https://en.wikipedia.org/wiki/Reuters_Instrument_Code)
      * * `BBG`: [Bloomberg Ticker](https://www.bloomberg.com/professional/product/market-data/)
      * * `PERMID`: [PERMID](https://permid.org/)
      * * `FIGI`: [FIGI](https://www.openfigi.com/about/figi)
      */
    @JSName("id")
    var id_InstrumentContext: BBG = js.native
    
    /**
      * The context type is always 'fdc3.instrument'.
      */
    @JSName("type")
    var type_InstrumentContext: fdc3Dotinstrument = js.native
  }
  object InstrumentContext {
    
    @scala.inline
    def apply(id: BBG, `type`: fdc3Dotinstrument): InstrumentContext = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstrumentContext]
    }
    
    @scala.inline
    implicit class InstrumentContextMutableBuilder[Self <: InstrumentContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: BBG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: fdc3Dotinstrument): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OrganizationContext extends Context {
    
    /**
      * The organization data. Can contain either or both
      * * `LEI`: [LEI](https://www.gleif.org/en/about-lei/introducing-the-legal-entity-identifier-lei)
      * * `PERMID`: [PERMID](https://permid.org/)
      */
    @JSName("id")
    var id_OrganizationContext: LEI = js.native
    
    /**
      * The context type is always fdc3.organization.
      */
    @JSName("type")
    var type_OrganizationContext: fdc3Dotorganization = js.native
  }
  object OrganizationContext {
    
    @scala.inline
    def apply(id: LEI, `type`: fdc3Dotorganization): OrganizationContext = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationContext]
    }
    
    @scala.inline
    implicit class OrganizationContextMutableBuilder[Self <: OrganizationContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: LEI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: fdc3Dotorganization): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
