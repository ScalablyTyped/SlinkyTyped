package typingsSlinky.iobroker.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ioBroker {
  /** Infers the return type from a callback-style API and and leaves null and undefined in */
  type CallbackReturnTypeOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = typingsSlinky.iobroker.mod._Global_.ioBroker.SecondParameterOf[T]
  type ChownFileCallback = js.Function3[
    /* err */ java.lang.String | scala.Null, 
    /* entries */ js.UndefOr[js.Array[typingsSlinky.iobroker.mod._Global_.ioBroker.ChownFileResult]], 
    /* id */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type ChownObjectCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* list */ js.UndefOr[js.Array[typingsSlinky.iobroker.mod._Global_.ioBroker.Object]], 
    scala.Unit
  ]
  type DeleteStateCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* id */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type EmptyCallback = js.Function0[scala.Unit]
  type Enum = js.Any
  type EnumList = java.lang.String | js.Array[java.lang.String]
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]
  type ExtendObjectCallback = js.Function3[
    /* err */ java.lang.String | scala.Null, 
    /* result */ js.UndefOr[typingsSlinky.iobroker.AnonValue], 
    /* id */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type FindObjectCallback = js.Function3[
    /* err */ java.lang.String | scala.Null, 
    /* id */ js.UndefOr[java.lang.String], 
    /* name */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  // TODO: Redefine callbacks as subclass of GenericCallback
  type GenericCallback[T] = js.Function2[/* err */ java.lang.String | scala.Null, /* result */ js.UndefOr[T], scala.Unit]
  type GetBinaryStateCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* state */ js.UndefOr[typingsSlinky.node.Buffer], 
    scala.Unit
  ]
  type GetConfigKeysCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* list */ js.UndefOr[js.Array[java.lang.String]], 
    scala.Unit
  ]
  type GetEnumCallback = js.Function3[
    /* err */ java.lang.String | scala.Null, 
    /* enums */ typingsSlinky.std.Record[java.lang.String, typingsSlinky.iobroker.mod._Global_.ioBroker.Enum], 
    /* requestedEnum */ java.lang.String, 
    scala.Unit
  ]
  type GetEnumsCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* result */ org.scalablytyped.runtime.StringDictionary[
      typingsSlinky.std.Record[java.lang.String, typingsSlinky.iobroker.mod._Global_.ioBroker.Enum]
    ], 
    scala.Unit
  ]
  type GetHistoryCallback = js.Function4[
    /* err */ java.lang.String | scala.Null, 
    /* result */ typingsSlinky.iobroker.mod._Global_.ioBroker.GetHistoryResult, 
    /* step */ scala.Double, 
    /* sessionId */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type GetHistoryResult = js.Array[typingsSlinky.iobroker.Stateidstring]
  type GetObjectCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* obj */ js.UndefOr[typingsSlinky.iobroker.mod._Global_.ioBroker.Object | scala.Null], 
    scala.Unit
  ]
  type GetObjectListCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* result */ js.UndefOr[typingsSlinky.iobroker.AnonRowsArray], 
    scala.Unit
  ]
  type GetObjectViewCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* result */ js.UndefOr[typingsSlinky.iobroker.AnonRows], 
    scala.Unit
  ]
  type GetObjectsCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* objects */ typingsSlinky.std.Record[java.lang.String, typingsSlinky.iobroker.mod._Global_.ioBroker.Object], 
    scala.Unit
  ]
  // This is a version used by GetDevices/GetChannelsOf/GetStatesOf
  type GetObjectsCallback3[T /* <: typingsSlinky.iobroker.mod._Global_.ioBroker.BaseObject */] = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* result */ js.UndefOr[js.Array[T]], 
    scala.Unit
  ]
  type GetSessionCallback = js.Function1[/* session */ typingsSlinky.iobroker.mod._Global_.ioBroker.Session, scala.Unit]
  type GetStateCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* state */ js.UndefOr[typingsSlinky.iobroker.mod._Global_.ioBroker.State | scala.Null], 
    scala.Unit
  ]
  type GetStatesCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* states */ typingsSlinky.std.Record[java.lang.String, typingsSlinky.iobroker.mod._Global_.ioBroker.State], 
    scala.Unit
  ]
  type Log = js.Any
  type MessageCallback = js.Function1[
    /* response */ js.UndefOr[typingsSlinky.iobroker.mod._Global_.ioBroker.Message], 
    scala.Unit
  ]
  type MessageHandler = js.Function1[
    /* obj */ typingsSlinky.iobroker.mod._Global_.ioBroker.Message, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type MessagePayload = java.lang.String | (typingsSlinky.std.Record[java.lang.String, js.Any])
  /** Infers the return type from a callback-style API and strips out null and undefined */
  type NonNullCallbackReturnTypeOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = typingsSlinky.std.Exclude[
    typingsSlinky.iobroker.mod._Global_.ioBroker.SecondParameterOf[T], 
    js.UndefOr[scala.Null]
  ]
  type ObjectChangeHandler = js.Function2[
    /* id */ java.lang.String, 
    /* obj */ js.UndefOr[typingsSlinky.iobroker.mod._Global_.ioBroker.Object | scala.Null], 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type ReadDirCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* entries */ js.UndefOr[js.Array[typingsSlinky.iobroker.mod._Global_.ioBroker.ReadDirResult]], 
    scala.Unit
  ]
  type ReadFileCallback = js.Function3[
    /* err */ java.lang.String | scala.Null, 
    /* file */ js.UndefOr[typingsSlinky.node.Buffer | java.lang.String], 
    /* mimeType */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  // end interface Adapter
  type ReadyHandler = js.Function0[scala.Unit | js.Promise[scala.Unit]]
  type RmCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* entries */ js.UndefOr[js.Array[typingsSlinky.iobroker.mod._Global_.ioBroker.RmResult]], 
    scala.Unit
  ]
  type SecondParameterOf[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type Session = js.Any
  type SetObjectCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* obj */ typingsSlinky.iobroker.AnonIdString, 
    scala.Unit
  ]
  type SetStateCallback = js.Function2[
    /* err */ java.lang.String | scala.Null, 
    /* id */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type SetStateChangedCallback = js.Function3[
    /* err */ java.lang.String | scala.Null, 
    /* id */ java.lang.String, 
    /* notChanged */ scala.Boolean, 
    scala.Unit
  ]
  // In set[Foreign]Object[NotExists] methods, the ID and acl of the object is optional
  type SettableObject = typingsSlinky.iobroker.mod._Global_.ioBroker.SettableObjectWorker[typingsSlinky.iobroker.mod._Global_.ioBroker.Object]
  type SettableObjectWorker[T /* <: typingsSlinky.iobroker.mod._Global_.ioBroker.Object */] = (typingsSlinky.std.Pick[
    T, 
    typingsSlinky.std.Exclude[
      java.lang.String, 
      typingsSlinky.iobroker.iobrokerStrings._id | typingsSlinky.iobroker.iobrokerStrings.acl
    ]
  ]) with typingsSlinky.iobroker.AnonAcl[T]
  type StateChangeHandler = js.Function2[
    /* id */ java.lang.String, 
    /* obj */ js.UndefOr[typingsSlinky.iobroker.mod._Global_.ioBroker.State | scala.Null], 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type UnloadHandler = js.Function1[
    /* callback */ typingsSlinky.iobroker.mod._Global_.ioBroker.EmptyCallback, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type UserGroup = js.Any
}
