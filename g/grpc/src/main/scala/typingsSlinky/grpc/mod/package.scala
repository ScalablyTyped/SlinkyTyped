package typingsSlinky.grpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Any client call type
    */
  type Call = typingsSlinky.grpc.mod.ClientUnaryCall | typingsSlinky.grpc.mod.ClientReadableStream[js.Any] | typingsSlinky.grpc.mod.ClientWritableStream[js.Any] | (typingsSlinky.grpc.mod.ClientDuplexStream[js.Any, js.Any])
  
  type CancelRequester = js.Function1[/* next */ js.Function, scala.Unit]
  
  type CheckServerIdentityCallback = js.Function2[
    /* hostname */ java.lang.String, 
    /* cert */ typingsSlinky.grpc.mod.Certificate, 
    js.UndefOr[js.Error]
  ]
  
  type CloseRequester = js.Function1[/* next */ js.Function, scala.Unit]
  
  type Deadline = scala.Double | js.Date
  
  type Filename = java.lang.String | typingsSlinky.grpc.anon.File
  
  type GetPeerRequester = js.Function1[/* next */ js.Function, java.lang.String]
  
  type MessageListener = js.Function2[/* message */ js.Any, /* next */ js.Function, scala.Unit]
  
  type MessageRequester = js.Function2[/* message */ js.Any, /* next */ js.Function, scala.Unit]
  
  type MetadataListener = js.Function2[/* metadata */ typingsSlinky.grpc.mod.Metadata, /* next */ js.Function, scala.Unit]
  
  type MetadataRequester = js.Function3[
    /* metadata */ typingsSlinky.grpc.mod.Metadata, 
    /* listener */ typingsSlinky.grpc.mod.Listener, 
    /* next */ js.Function, 
    scala.Unit
  ]
  
  type MetadataValue = java.lang.String | typingsSlinky.node.Buffer
  
  type PackageDefinition = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.grpc.mod.ServiceDefinition[js.Any] | typingsSlinky.grpc.mod.ProtobufTypeDefinition
  ]
  
  type ServerWriteableStream[RequestType, ResponseType] = typingsSlinky.grpc.mod.ServerWritableStream[RequestType, ResponseType]
  
  type ServiceDefinition[ImplementationType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ I in keyof ImplementationType ]: grpc.grpc.MethodDefinition<any, any>}
    */ typingsSlinky.grpc.grpcStrings.ServiceDefinition with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type StatusListener = js.Function2[/* status */ typingsSlinky.grpc.mod.StatusObject, /* next */ js.Function, scala.Unit]
  
  type UntypedServiceImplementation = org.scalablytyped.runtime.StringDictionary[typingsSlinky.grpc.mod.handleCall[js.Any, js.Any]]
  
  @scala.inline
  def closeClient(clientObj: typingsSlinky.grpc.mod.Client): scala.Unit = typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("closeClient")(clientObj.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * A deserialization function
    * @param data The byte sequence to deserialize
    * @return The data deserialized as a value
    */
  type deserialize[T] = js.Function1[/* data */ typingsSlinky.node.Buffer, T]
  
  @scala.inline
  def getClientChannel(client: typingsSlinky.grpc.mod.Client): typingsSlinky.grpc.mod.Channel = typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getClientChannel")(client.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.grpc.mod.Channel]
  
  /**
    * User provided method to handle bidirectional streaming calls on the server.
    */
  type handleBidiStreamingCall[RequestType, ResponseType] = js.Function1[
    /* call */ typingsSlinky.grpc.mod.ServerDuplexStream[RequestType, ResponseType], 
    scala.Unit
  ]
  
  type handleCall[RequestType, ResponseType] = (typingsSlinky.grpc.mod.handleUnaryCall[RequestType, ResponseType]) | (typingsSlinky.grpc.mod.handleClientStreamingCall[RequestType, ResponseType]) | (typingsSlinky.grpc.mod.handleServerStreamingCall[RequestType, ResponseType]) | (typingsSlinky.grpc.mod.handleBidiStreamingCall[RequestType, ResponseType])
  
  /**
    * User provided method to handle client streaming methods on the server.
    */
  type handleClientStreamingCall[RequestType, ResponseType] = js.Function2[
    /* call */ typingsSlinky.grpc.mod.ServerReadableStream[RequestType], 
    /* callback */ typingsSlinky.grpc.mod.sendUnaryData[ResponseType], 
    scala.Unit
  ]
  
  /**
    * User provided method to handle server streaming methods on the server.
    */
  type handleServerStreamingCall[RequestType, ResponseType] = js.Function1[
    /* call */ typingsSlinky.grpc.mod.ServerWritableStream[RequestType, ResponseType], 
    scala.Unit
  ]
  
  /**
    * User-provided method to handle unary requests on a server
    */
  type handleUnaryCall[RequestType, ResponseType] = js.Function2[
    /* call */ typingsSlinky.grpc.mod.ServerUnaryCall[RequestType], 
    /* callback */ typingsSlinky.grpc.mod.sendUnaryData[ResponseType], 
    scala.Unit
  ]
  
  @scala.inline
  def load[T](filename: typingsSlinky.grpc.mod.Filename): T = typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def load[T](
    filename: typingsSlinky.grpc.mod.Filename,
    format: js.UndefOr[scala.Nothing],
    options: typingsSlinky.grpc.mod.LoadOptions
  ): T = (typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def loadObject[T](value: js.Object): T = typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadObject")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def loadObject[T](value: js.Object, options: typingsSlinky.grpc.mod.LoadObjectOptions): T = (typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadObject")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def loadPackageDefinition(packageDefinition: typingsSlinky.grpc.mod.PackageDefinition): typingsSlinky.grpc.mod.GrpcObject = typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadPackageDefinition")(packageDefinition.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.grpc.mod.GrpcObject]
  
  @scala.inline
  def load_json[T](filename: typingsSlinky.grpc.mod.Filename, format: typingsSlinky.grpc.grpcStrings.json): T = (typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def load_json[T](
    filename: typingsSlinky.grpc.mod.Filename,
    format: typingsSlinky.grpc.grpcStrings.json,
    options: typingsSlinky.grpc.mod.LoadOptions
  ): T = (typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def load_proto[T](filename: typingsSlinky.grpc.mod.Filename, format: typingsSlinky.grpc.grpcStrings.proto): T = (typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def load_proto[T](
    filename: typingsSlinky.grpc.mod.Filename,
    format: typingsSlinky.grpc.grpcStrings.proto,
    options: typingsSlinky.grpc.mod.LoadOptions
  ): T = (typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def makeGenericClientConstructor(
    methods: typingsSlinky.grpc.mod.ServiceDefinition[_],
    serviceName: java.lang.String,
    classOptions: typingsSlinky.grpc.mod.GenericClientOptions
  ): org.scalablytyped.runtime.Instantiable3[
    /* address */ java.lang.String, 
    /* credentials */ typingsSlinky.grpc.mod.ChannelCredentials, 
    /* options */ js.UndefOr[js.Object], 
    typingsSlinky.grpc.mod.Client
  ] = (typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeGenericClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], classOptions.asInstanceOf[js.Any])).asInstanceOf[org.scalablytyped.runtime.Instantiable3[
    /* address */ java.lang.String, 
    /* credentials */ typingsSlinky.grpc.mod.ChannelCredentials, 
    /* options */ js.UndefOr[js.Object], 
    typingsSlinky.grpc.mod.Client
  ]]
  
  type metadataGenerator = js.Function2[
    /* params */ typingsSlinky.grpc.anon.Serviceurl, 
    /* callback */ js.Function2[
      /* error */ js.Error | scala.Null, 
      /* metadata */ js.UndefOr[typingsSlinky.grpc.mod.Metadata], 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type requestCallback[ResponseType] = js.Function2[
    /* error */ typingsSlinky.grpc.mod.ServiceError | scala.Null, 
    /* value */ js.UndefOr[ResponseType], 
    scala.Unit
  ]
  
  /**
    * Callback function passed to server handlers that handle methods with
    * unary responses.
    */
  type sendUnaryData[ResponseType] = js.Function4[
    /* error */ typingsSlinky.grpc.mod.ServiceError | scala.Null, 
    /* value */ ResponseType | scala.Null, 
    /* trailer */ js.UndefOr[typingsSlinky.grpc.mod.Metadata], 
    /* flags */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  
  /**
    * A serialization function
    * @param value The value to serialize
    * @return The value serialized as a byte sequence
    */
  type serialize[T] = js.Function1[/* value */ T, typingsSlinky.node.Buffer]
  
  @scala.inline
  def setLogVerbosity(verbosity: typingsSlinky.grpc.mod.logVerbosity): scala.Unit = typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setLogVerbosity")(verbosity.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setLogger(logger: org.scalajs.dom.raw.Console): scala.Unit = typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def waitForClientReady(
    client: typingsSlinky.grpc.mod.Client,
    deadline: typingsSlinky.grpc.mod.Deadline,
    callback: js.Function1[/* error */ js.Error | scala.Null, scala.Unit]
  ): scala.Unit = (typingsSlinky.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("waitForClientReady")(client.asInstanceOf[js.Any], deadline.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
