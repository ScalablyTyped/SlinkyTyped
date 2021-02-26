package typingsSlinky.matrixJsSdk

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CacheSecretStorageKey extends StObject {
    
    var cacheSecretStorageKey: js.UndefOr[js.Function2[/* keyId */ String, /* key */ js.typedarray.Uint8Array, _]] = js.native
    
    var getCrossSigningKey: js.UndefOr[
        js.Function2[
          /* keyType */ String, 
          /* pubKey */ js.typedarray.Uint8Array, 
          js.Promise[js.typedarray.Uint8Array]
        ]
      ] = js.native
    
    var getSecretStorageKey: js.UndefOr[
        js.Function2[
          /* keys */ Keys, 
          /* name */ String, 
          js.Promise[(js.Tuple2[String, js.typedarray.Uint8Array]) | Null]
        ]
      ] = js.native
    
    var onSecretRequested: js.UndefOr[
        js.Function5[
          /* name */ String, 
          /* userId */ String, 
          /* deviceId */ String, 
          /* requestId */ String, 
          /* deviceTrust */ js.Any, 
          js.Promise[String]
        ]
      ] = js.native
    
    var saveCrossSigningKeys: js.UndefOr[js.Function1[/* keys */ Record[String, js.typedarray.Uint8Array], _]] = js.native
    
    var shouldUpgradeDeviceVerifications: js.UndefOr[js.Function1[/* users */ Record[String, _], js.Promise[js.Array[String]]]] = js.native
  }
  object CacheSecretStorageKey {
    
    @scala.inline
    def apply(): CacheSecretStorageKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheSecretStorageKey]
    }
    
    @scala.inline
    implicit class CacheSecretStorageKeyMutableBuilder[Self <: CacheSecretStorageKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheSecretStorageKey(value: (/* keyId */ String, /* key */ js.typedarray.Uint8Array) => _): Self = StObject.set(x, "cacheSecretStorageKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCacheSecretStorageKeyUndefined: Self = StObject.set(x, "cacheSecretStorageKey", js.undefined)
      
      @scala.inline
      def setGetCrossSigningKey(
        value: (/* keyType */ String, /* pubKey */ js.typedarray.Uint8Array) => js.Promise[js.typedarray.Uint8Array]
      ): Self = StObject.set(x, "getCrossSigningKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetCrossSigningKeyUndefined: Self = StObject.set(x, "getCrossSigningKey", js.undefined)
      
      @scala.inline
      def setGetSecretStorageKey(
        value: (/* keys */ Keys, /* name */ String) => js.Promise[(js.Tuple2[String, js.typedarray.Uint8Array]) | Null]
      ): Self = StObject.set(x, "getSecretStorageKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetSecretStorageKeyUndefined: Self = StObject.set(x, "getSecretStorageKey", js.undefined)
      
      @scala.inline
      def setOnSecretRequested(
        value: (/* name */ String, /* userId */ String, /* deviceId */ String, /* requestId */ String, /* deviceTrust */ js.Any) => js.Promise[String]
      ): Self = StObject.set(x, "onSecretRequested", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnSecretRequestedUndefined: Self = StObject.set(x, "onSecretRequested", js.undefined)
      
      @scala.inline
      def setSaveCrossSigningKeys(value: /* keys */ Record[String, js.typedarray.Uint8Array] => _): Self = StObject.set(x, "saveCrossSigningKeys", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSaveCrossSigningKeysUndefined: Self = StObject.set(x, "saveCrossSigningKeys", js.undefined)
      
      @scala.inline
      def setShouldUpgradeDeviceVerifications(value: /* users */ Record[String, _] => js.Promise[js.Array[String]]): Self = StObject.set(x, "shouldUpgradeDeviceVerifications", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldUpgradeDeviceVerificationsUndefined: Self = StObject.set(x, "shouldUpgradeDeviceVerifications", js.undefined)
    }
  }
  
  @js.native
  trait DeviceId extends StObject {
    
    var deviceId: String = js.native
    
    var olmDevice: PickleKey = js.native
    
    var userId: String = js.native
  }
  object DeviceId {
    
    @scala.inline
    def apply(deviceId: String, olmDevice: PickleKey, userId: String): DeviceId = {
      val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], olmDevice = olmDevice.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceId]
    }
    
    @scala.inline
    implicit class DeviceIdMutableBuilder[Self <: DeviceId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOlmDevice(value: PickleKey): Self = StObject.set(x, "olmDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Keys extends StObject {
    
    var keys: Record[String, Pubkey] = js.native
  }
  object Keys {
    
    @scala.inline
    def apply(keys: Record[String, Pubkey]): Keys = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keys]
    }
    
    @scala.inline
    implicit class KeysMutableBuilder[Self <: Keys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeys(value: Record[String, Pubkey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PickleKey extends StObject {
    
    var pickleKey: String = js.native
    
    var pickledAccount: String = js.native
    
    var sessions: js.Array[Record[String, _]] = js.native
  }
  object PickleKey {
    
    @scala.inline
    def apply(pickleKey: String, pickledAccount: String, sessions: js.Array[Record[String, _]]): PickleKey = {
      val __obj = js.Dynamic.literal(pickleKey = pickleKey.asInstanceOf[js.Any], pickledAccount = pickledAccount.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickleKey]
    }
    
    @scala.inline
    implicit class PickleKeyMutableBuilder[Self <: PickleKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPickleKey(value: String): Self = StObject.set(x, "pickleKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickledAccount(value: String): Self = StObject.set(x, "pickledAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessions(value: js.Array[Record[String, _]]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionsVarargs(value: (Record[String, js.Any])*): Self = StObject.set(x, "sessions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Promise extends StObject {
    
    var promise: js.Promise[_] = js.native
    
    var reject: js.Any = js.native
    
    var resolve: js.Any = js.native
  }
  object Promise {
    
    @scala.inline
    def apply(promise: js.Promise[_], reject: js.Any, resolve: js.Any): Promise = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[Promise]
    }
    
    @scala.inline
    implicit class PromiseMutableBuilder[Self <: Promise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPromise(value: js.Promise[_]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReject(value: js.Any): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve(value: js.Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pubkey extends StObject {
    
    var pubkey: js.typedarray.Uint8Array = js.native
  }
  object Pubkey {
    
    @scala.inline
    def apply(pubkey: js.typedarray.Uint8Array): Pubkey = {
      val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pubkey]
    }
    
    @scala.inline
    implicit class PubkeyMutableBuilder[Self <: Pubkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPubkey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
    }
  }
}
