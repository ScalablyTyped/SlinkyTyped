package typingsSlinky.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse.StatusCase
import typingsSlinky.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus
import typingsSlinky.libraCore.transactionPbMod.SignedTransaction
import typingsSlinky.libraCore.vmErrorsPbMod.VMStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object admissionControlPbMod {
  
  @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus")
  @js.native
  class AdmissionControlStatus () extends Message {
    
    def getCode(): AdmissionControlStatusCode = js.native
    
    def getMessage(): String = js.native
    
    def setCode(value: AdmissionControlStatusCode): Unit = js.native
    
    def setMessage(value: String): Unit = js.native
  }
  /* static members */
  object AdmissionControlStatus {
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): AdmissionControlStatus = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: AdmissionControlStatus, reader: BinaryReader): AdmissionControlStatus = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: AdmissionControlStatus, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: AdmissionControlStatus): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var code: AdmissionControlStatusCode = js.native
      
      var message: String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(code: AdmissionControlStatusCode, message: String): AsObject = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCode(value: AdmissionControlStatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  sealed trait AdmissionControlStatusCode extends StObject
  @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatusCode")
  @js.native
  object AdmissionControlStatusCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AdmissionControlStatusCode with Double] = js.native
    
    @js.native
    sealed trait ACCEPTED extends AdmissionControlStatusCode
    /* 0 */ val ACCEPTED: typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatusCode.ACCEPTED with Double = js.native
    
    @js.native
    sealed trait BLACKLISTED extends AdmissionControlStatusCode
    /* 1 */ val BLACKLISTED: typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatusCode.BLACKLISTED with Double = js.native
    
    @js.native
    sealed trait REJECTED extends AdmissionControlStatusCode
    /* 2 */ val REJECTED: typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatusCode.REJECTED with Double = js.native
  }
  
  @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionRequest")
  @js.native
  class SubmitTransactionRequest () extends Message {
    
    def clearSignedTxn(): Unit = js.native
    
    def getSignedTxn(): js.UndefOr[SignedTransaction] = js.native
    
    def hasSignedTxn(): Boolean = js.native
    
    def setSignedTxn(): Unit = js.native
    def setSignedTxn(value: SignedTransaction): Unit = js.native
  }
  /* static members */
  object SubmitTransactionRequest {
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionRequest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionRequest.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): SubmitTransactionRequest = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionRequest.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: SubmitTransactionRequest, reader: BinaryReader): SubmitTransactionRequest = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionRequest.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionRequest.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionRequest.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: SubmitTransactionRequest, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionRequest.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: SubmitTransactionRequest): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var signedTxn: js.UndefOr[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(): AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSignedTxn(value: typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject): Self = StObject.set(x, "signedTxn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSignedTxnUndefined: Self = StObject.set(x, "signedTxn", js.undefined)
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse")
  @js.native
  class SubmitTransactionResponse () extends Message {
    
    def clearAcStatus(): Unit = js.native
    
    def clearMempoolStatus(): Unit = js.native
    
    def clearVmStatus(): Unit = js.native
    
    def getAcStatus(): js.UndefOr[AdmissionControlStatus] = js.native
    
    def getMempoolStatus(): js.UndefOr[MempoolAddTransactionStatus] = js.native
    
    def getStatusCase(): StatusCase = js.native
    
    def getValidatorId(): js.typedarray.Uint8Array | String = js.native
    
    def getValidatorId_asB64(): String = js.native
    
    def getValidatorId_asU8(): js.typedarray.Uint8Array = js.native
    
    def getVmStatus(): js.UndefOr[VMStatus] = js.native
    
    def hasAcStatus(): Boolean = js.native
    
    def hasMempoolStatus(): Boolean = js.native
    
    def hasVmStatus(): Boolean = js.native
    
    def setAcStatus(): Unit = js.native
    def setAcStatus(value: AdmissionControlStatus): Unit = js.native
    
    def setMempoolStatus(): Unit = js.native
    def setMempoolStatus(value: MempoolAddTransactionStatus): Unit = js.native
    
    def setValidatorId(value: String): Unit = js.native
    def setValidatorId(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setVmStatus(): Unit = js.native
    def setVmStatus(value: VMStatus): Unit = js.native
  }
  /* static members */
  object SubmitTransactionResponse {
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait StatusCase extends StObject
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse.StatusCase")
    @js.native
    object StatusCase extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[StatusCase with Double] = js.native
      
      @js.native
      sealed trait AC_STATUS extends StatusCase
      /* 2 */ val AC_STATUS: typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse.StatusCase.AC_STATUS with Double = js.native
      
      @js.native
      sealed trait MEMPOOL_STATUS extends StatusCase
      /* 3 */ val MEMPOOL_STATUS: typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse.StatusCase.MEMPOOL_STATUS with Double = js.native
      
      @js.native
      sealed trait STATUS_NOT_SET extends StatusCase
      /* 0 */ val STATUS_NOT_SET: typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse.StatusCase.STATUS_NOT_SET with Double = js.native
      
      @js.native
      sealed trait VM_STATUS extends StatusCase
      /* 1 */ val VM_STATUS: typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse.StatusCase.VM_STATUS with Double = js.native
    }
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): SubmitTransactionResponse = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: SubmitTransactionResponse, reader: BinaryReader): SubmitTransactionResponse = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: SubmitTransactionResponse, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: SubmitTransactionResponse): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var acStatus: js.UndefOr[typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatus.AsObject] = js.native
      
      var mempoolStatus: js.UndefOr[typingsSlinky.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject] = js.native
      
      var validatorId: js.typedarray.Uint8Array | String = js.native
      
      var vmStatus: js.UndefOr[typingsSlinky.libraCore.vmErrorsPbMod.VMStatus.AsObject] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(validatorId: js.typedarray.Uint8Array | String): AsObject = {
        val __obj = js.Dynamic.literal(validatorId = validatorId.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAcStatus(value: typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatus.AsObject): Self = StObject.set(x, "acStatus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAcStatusUndefined: Self = StObject.set(x, "acStatus", js.undefined)
        
        @scala.inline
        def setMempoolStatus(value: typingsSlinky.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject): Self = StObject.set(x, "mempoolStatus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMempoolStatusUndefined: Self = StObject.set(x, "mempoolStatus", js.undefined)
        
        @scala.inline
        def setValidatorId(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "validatorId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValidatorIdUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "validatorId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVmStatus(value: typingsSlinky.libraCore.vmErrorsPbMod.VMStatus.AsObject): Self = StObject.set(x, "vmStatus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVmStatusUndefined: Self = StObject.set(x, "vmStatus", js.undefined)
      }
    }
  }
}
