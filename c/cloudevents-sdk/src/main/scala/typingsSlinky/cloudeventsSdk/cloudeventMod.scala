package typingsSlinky.cloudeventsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudeventMod {
  
  @JSImport("cloudevents-sdk/lib/cloudevent", "CloudEvent")
  @js.native
  class CloudEvent protected () extends StObject {
    /**
      * Creates a new CloudEvent instance
      * @param {object} event CloudEvent properties as a simple object
      * @param {string} event.source Identifies the context in which an event happened as a URI reference
      * @param {string} event.type Describes the type of event related to the originating occurrence
      * @param {string} [event.id] A unique ID for this event - if not supplied, will be autogenerated
      * @param {string} [event.time] A timestamp for this event. May also be provided as a Date
      * @param {string} [event.subject] Describes the subject of the event in the context of the event producer
      * @param {string} [event.dataContentType] The mime content type for the event data
      * @param {string} [event.dataSchema] The URI of the schema that the event data adheres to (v1.0 events)
      * @param {string} [event.schemaURL]  The URI of the schema that the event data adheres to (v0.3 events)
      * @param {string} [event.dataContentEncoding] The content encoding for the event data (v0.3 events)
      * @param {string} [event.specversion] The CloudEvent specification version for this event - default: 1.0
      * @param {*} [event.data] The event payload
      */
    def this(event: CE) = this()
    
    /**
      * Adds an extension attribute to this CloudEvent
      * @see https://github.com/cloudevents/spec/blob/master/spec.md#extension-context-attributes
      * @param {string} key the name of the extension attribute
      * @param {*} value the value of the extension attribute
      * @returns {void}
      */
    def addExtension(key: String, value: js.Any): Unit = js.native
    
    /**
      * Gets or sets the data for this event
      * @see https://github.com/cloudevents/spec/blob/master/spec.md#event-data
      * @type {*}
      */
    def data: js.Any = js.native
    
    /**
      * Gets or sets the event's data content encoding
      * @type {string}
      * @see https://github.com/cloudevents/spec/blob/v0.3/spec.md#datacontentencoding
      */
    def dataContentEncoding: js.Any = js.native
    def dataContentEncoding_=(dataContentEncoding: js.Any): Unit = js.native
    
    /**
      * Gets or sets the content type of the data value for this event
      * @type {string}
      * @see https://github.com/cloudevents/spec/blob/master/spec.md#datacontenttype
      */
    def dataContentType: js.Any = js.native
    def dataContentType_=(contenttype: js.Any): Unit = js.native
    
    /**
      * Gets or sets the event's data schema
      * @type {string}
      * @see https://github.com/cloudevents/spec/blob/v1.0/spec.md#dataschema
      */
    def dataSchema: js.Any = js.native
    def dataSchema_=(dataschema: js.Any): Unit = js.native
    
    def data_=(data: js.Any): Unit = js.native
    
    /**
      * Formats the CloudEvent as JSON. Validates the event according
      * to the CloudEvent specification and throws an exception if
      * it's invalid.
      * @returns {JSON} the CloudEvent in JSON form
      * @throws {ValidationError} if this event cannot be validated against the specification
      */
    def format(): js.Any = js.native
    
    var formatter: js.Any = js.native
    
    /**
      * Gets the extension attributes, if any, associated with this event
      * @see https://github.com/cloudevents/spec/blob/master/spec.md#extension-context-attributes
      * @returns {Object} the extensions attributes - if none exist will will be {}
      */
    def getExtensions(): js.Object = js.native
    
    /**
      * Gets or sets the event id. Source + id must be unique for each distinct event.
      * @see https://github.com/cloudevents/spec/blob/master/spec.md#id
      * @type {string}
      */
    def id: js.Any = js.native
    def id_=(id: js.Any): Unit = js.native
    
    /**
      * DEPRECATED: Gets or sets the schema URL for this event. Throws {TypeError}
      * if this is a version 1.0 event.
      * @type {string}
      * @see https://github.com/cloudevents/spec/blob/v0.3/spec.md#schemaurl
      */
    def schemaURL: js.Any = js.native
    def schemaURL_=(schemaurl: js.Any): Unit = js.native
    
    /**
      * Gets or sets the origination source of this event as a URI.
      * @type {string}
      * @see https://github.com/cloudevents/spec/blob/master/spec.md#source-1
      */
    def source: js.Any = js.native
    def source_=(source: js.Any): Unit = js.native
    
    var spec: js.Any = js.native
    
    /**
      * Gets the CloudEvent specification version
      * @type {string}
      * @see https://github.com/cloudevents/spec/blob/master/spec.md#specversion
      */
    def specversion: js.Any = js.native
    
    /**
      * Gets or sets the event subject
      * @type {string}
      * @see https://github.com/cloudevents/spec/blob/v1.0/spec.md#subject
      */
    def subject: js.Any = js.native
    def subject_=(subject: js.Any): Unit = js.native
    
    /**
      * Gets or sets the timestamp for this event as an ISO formatted date string
      * @type {string}
      * @see https://github.com/cloudevents/spec/blob/master/spec.md#time
      */
    def time: js.Any = js.native
    def time_=(time: js.Any): Unit = js.native
    
    /**
      * Gets or sets the event type
      * @type {string}
      * @see https://github.com/cloudevents/spec/blob/master/spec.md#type
      */
    def `type`: js.Any = js.native
    def type_=(`type`: js.Any): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cloudeventsSdk.v1Mod.CloudEventV1
    - typingsSlinky.cloudeventsSdk.v1Mod.CloudEventV1Attributes
    - typingsSlinky.cloudeventsSdk.v03Mod.CloudEventV03
    - typingsSlinky.cloudeventsSdk.v03Mod.CloudEventV03Attributes
  */
  trait CE extends StObject
  object CE {
    
    @scala.inline
    def CloudEventV03(id: String, source: String, specversion: String, `type`: String): typingsSlinky.cloudeventsSdk.v03Mod.CloudEventV03 = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specversion = specversion.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.cloudeventsSdk.v03Mod.CloudEventV03]
    }
    
    @scala.inline
    def CloudEventV03Attributes(source: String, `type`: String): typingsSlinky.cloudeventsSdk.v03Mod.CloudEventV03Attributes = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.cloudeventsSdk.v03Mod.CloudEventV03Attributes]
    }
    
    @scala.inline
    def CloudEventV1(id: String, source: String, specversion: String, `type`: String): typingsSlinky.cloudeventsSdk.v1Mod.CloudEventV1 = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specversion = specversion.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.cloudeventsSdk.v1Mod.CloudEventV1]
    }
    
    @scala.inline
    def CloudEventV1Attributes(source: String, `type`: String): typingsSlinky.cloudeventsSdk.v1Mod.CloudEventV1Attributes = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.cloudeventsSdk.v1Mod.CloudEventV1Attributes]
    }
  }
}
