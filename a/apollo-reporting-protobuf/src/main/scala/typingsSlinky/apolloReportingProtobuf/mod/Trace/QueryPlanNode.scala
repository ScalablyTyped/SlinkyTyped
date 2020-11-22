package typingsSlinky.apolloReportingProtobuf.mod.Trace

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.IConversionOptions
import typingsSlinky.apolloProtobufjs.mod.Reader
import typingsSlinky.apolloProtobufjs.mod.Writer
import typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFetchNode
import typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFlattenNode
import typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IParallelNode
import typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IResponsePathElement
import typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ISequenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a QueryPlanNode. */
@JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode")
@js.native
/**
  * Constructs a new QueryPlanNode.
  * @param [properties] Properties to set
  */
class QueryPlanNode ()
  extends typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode {
  def this(properties: IQueryPlanNode) = this()
}
/* static members */
@JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode")
@js.native
object QueryPlanNode extends js.Object {
  
  /**
    * Creates a new QueryPlanNode instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryPlanNode instance
    */
  def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  def create(properties: IQueryPlanNode): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  
  /**
    * Decodes a QueryPlanNode message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryPlanNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  
  /**
    * Decodes a QueryPlanNode message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryPlanNode
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  
  /**
    * Encodes the specified QueryPlanNode message. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
    * @param message QueryPlanNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IQueryPlanNode): Writer = js.native
  def encode(message: IQueryPlanNode, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified QueryPlanNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
    * @param message QueryPlanNode message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IQueryPlanNode): Writer = js.native
  def encodeDelimited(message: IQueryPlanNode, writer: Writer): Writer = js.native
  
  /**
    * Creates a QueryPlanNode message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns QueryPlanNode
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
  
  /**
    * Creates a plain object from a QueryPlanNode message. Also converts values to other types if specified.
    * @param message QueryPlanNode
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a QueryPlanNode message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Represents a FetchNode. */
  @js.native
  /**
    * Constructs a new FetchNode.
    * @param [properties] Properties to set
    */
  class FetchNode ()
    extends typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode {
    def this(properties: IFetchNode) = this()
  }
  /* static members */
  @js.native
  object FetchNode extends js.Object {
    
    /**
      * Creates a new FetchNode instance using the specified properties.
      * @param [properties] Properties to set
      * @returns FetchNode instance
      */
    def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
    def create(properties: IFetchNode): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
    
    /**
      * Decodes a FetchNode message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns FetchNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
    
    /**
      * Decodes a FetchNode message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns FetchNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
    
    /**
      * Encodes the specified FetchNode message. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
      * @param message FetchNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IFetchNode): Writer = js.native
    def encode(message: IFetchNode, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified FetchNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
      * @param message FetchNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IFetchNode): Writer = js.native
    def encodeDelimited(message: IFetchNode, writer: Writer): Writer = js.native
    
    /**
      * Creates a FetchNode message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns FetchNode
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
    
    /**
      * Creates a plain object from a FetchNode message. Also converts values to other types if specified.
      * @param message FetchNode
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode): StringDictionary[js.Any] = js.native
    def toObject(
      message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a FetchNode message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a FlattenNode. */
  @js.native
  /**
    * Constructs a new FlattenNode.
    * @param [properties] Properties to set
    */
  class FlattenNode ()
    extends typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode {
    def this(properties: IFlattenNode) = this()
  }
  /* static members */
  @js.native
  object FlattenNode extends js.Object {
    
    /**
      * Creates a new FlattenNode instance using the specified properties.
      * @param [properties] Properties to set
      * @returns FlattenNode instance
      */
    def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
    def create(properties: IFlattenNode): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
    
    /**
      * Decodes a FlattenNode message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns FlattenNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
    
    /**
      * Decodes a FlattenNode message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns FlattenNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
    
    /**
      * Encodes the specified FlattenNode message. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
      * @param message FlattenNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IFlattenNode): Writer = js.native
    def encode(message: IFlattenNode, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified FlattenNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
      * @param message FlattenNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IFlattenNode): Writer = js.native
    def encodeDelimited(message: IFlattenNode, writer: Writer): Writer = js.native
    
    /**
      * Creates a FlattenNode message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns FlattenNode
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
    
    /**
      * Creates a plain object from a FlattenNode message. Also converts values to other types if specified.
      * @param message FlattenNode
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode): StringDictionary[js.Any] = js.native
    def toObject(
      message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a FlattenNode message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a ParallelNode. */
  @js.native
  /**
    * Constructs a new ParallelNode.
    * @param [properties] Properties to set
    */
  class ParallelNode ()
    extends typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode {
    def this(properties: IParallelNode) = this()
  }
  /* static members */
  @js.native
  object ParallelNode extends js.Object {
    
    /**
      * Creates a new ParallelNode instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ParallelNode instance
      */
    def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
    def create(properties: IParallelNode): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
    
    /**
      * Decodes a ParallelNode message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ParallelNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
    
    /**
      * Decodes a ParallelNode message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ParallelNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
    
    /**
      * Encodes the specified ParallelNode message. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
      * @param message ParallelNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IParallelNode): Writer = js.native
    def encode(message: IParallelNode, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified ParallelNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
      * @param message ParallelNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IParallelNode): Writer = js.native
    def encodeDelimited(message: IParallelNode, writer: Writer): Writer = js.native
    
    /**
      * Creates a ParallelNode message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ParallelNode
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
    
    /**
      * Creates a plain object from a ParallelNode message. Also converts values to other types if specified.
      * @param message ParallelNode
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode): StringDictionary[js.Any] = js.native
    def toObject(
      message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a ParallelNode message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a ResponsePathElement. */
  @js.native
  /**
    * Constructs a new ResponsePathElement.
    * @param [properties] Properties to set
    */
  class ResponsePathElement ()
    extends typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement {
    def this(properties: IResponsePathElement) = this()
  }
  /* static members */
  @js.native
  object ResponsePathElement extends js.Object {
    
    /**
      * Creates a new ResponsePathElement instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ResponsePathElement instance
      */
    def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
    def create(properties: IResponsePathElement): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
    
    /**
      * Decodes a ResponsePathElement message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ResponsePathElement
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
    
    /**
      * Decodes a ResponsePathElement message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ResponsePathElement
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
    
    /**
      * Encodes the specified ResponsePathElement message. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
      * @param message ResponsePathElement message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IResponsePathElement): Writer = js.native
    def encode(message: IResponsePathElement, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified ResponsePathElement message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
      * @param message ResponsePathElement message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IResponsePathElement): Writer = js.native
    def encodeDelimited(message: IResponsePathElement, writer: Writer): Writer = js.native
    
    /**
      * Creates a ResponsePathElement message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ResponsePathElement
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
    
    /**
      * Creates a plain object from a ResponsePathElement message. Also converts values to other types if specified.
      * @param message ResponsePathElement
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement): StringDictionary[js.Any] = js.native
    def toObject(
      message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a ResponsePathElement message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a SequenceNode. */
  @js.native
  /**
    * Constructs a new SequenceNode.
    * @param [properties] Properties to set
    */
  class SequenceNode ()
    extends typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode {
    def this(properties: ISequenceNode) = this()
  }
  /* static members */
  @js.native
  object SequenceNode extends js.Object {
    
    /**
      * Creates a new SequenceNode instance using the specified properties.
      * @param [properties] Properties to set
      * @returns SequenceNode instance
      */
    def create(): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
    def create(properties: ISequenceNode): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
    
    /**
      * Decodes a SequenceNode message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns SequenceNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
    
    /**
      * Decodes a SequenceNode message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns SequenceNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
    
    /**
      * Encodes the specified SequenceNode message. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
      * @param message SequenceNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: ISequenceNode): Writer = js.native
    def encode(message: ISequenceNode, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified SequenceNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
      * @param message SequenceNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: ISequenceNode): Writer = js.native
    def encodeDelimited(message: ISequenceNode, writer: Writer): Writer = js.native
    
    /**
      * Creates a SequenceNode message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns SequenceNode
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
    
    /**
      * Creates a plain object from a SequenceNode message. Also converts values to other types if specified.
      * @param message SequenceNode
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode): StringDictionary[js.Any] = js.native
    def toObject(
      message: typingsSlinky.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a SequenceNode message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
