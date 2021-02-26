package typingsSlinky.nodemailer

import typingsSlinky.node.Buffer
import typingsSlinky.node.netMod.Socket
import typingsSlinky.nodemailer.mailerMod.^
import typingsSlinky.nodemailer.nodemailerBooleans.`false`
import typingsSlinky.nodemailer.nodemailerBooleans.`true`
import typingsSlinky.nodemailer.sesTransportMod.SentMessageInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var flatten: `false` = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(flatten: `false`): `0` = {
      val __obj = js.Dynamic.literal(flatten = flatten.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlatten(value: `false`): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Callback extends StObject {
    
    def callback(err: js.Error, info: SentMessageInfo): Unit = js.native
    def callback(err: Null, info: SentMessageInfo): Unit = js.native
    
    var mail: ^ = js.native
  }
  
  @js.native
  trait Comment extends StObject {
    
    var comment: String = js.native
    
    var url: String = js.native
  }
  object Comment {
    
    @scala.inline
    def apply(comment: String, url: String): Comment = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Connection extends StObject {
    
    var connection: Socket = js.native
  }
  object Connection {
    
    @scala.inline
    def apply(connection: Socket): Connection = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: Socket): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    /**
      * The raw data of the message. This data needs to base64-encoded if you are accessing Amazon SES directly through the HTTPS interface. If you are accessing Amazon SES using an AWS SDK, the SDK takes care of the base 64-encoding for you. In all cases, the client must ensure that the message format complies with Internet email standards regarding email header fields, MIME types, and MIME encoding. The To:, CC:, and BCC: headers in the raw message can contain a group list. If you are using SendRawEmail with sending authorization, you can include X-headers in the raw message to specify the "Source," "From," and "Return-Path" addresses. For more information, see the documentation for SendRawEmail.   Do not include these X-headers in the DKIM signature, because they are removed by Amazon SES before sending the email.  For more information, go to the Amazon SES Developer Guide.
      */
    var Data: Buffer | js.typedarray.Uint8Array | js.Object | String = js.native
  }
  object Data {
    
    @scala.inline
    def apply(Data: Buffer | js.typedarray.Uint8Array | js.Object | String): Data = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer | js.typedarray.Uint8Array | js.Object | String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Flatten extends StObject {
    
    var flatten: `true` = js.native
  }
  object Flatten {
    
    @scala.inline
    def apply(flatten: `true`): Flatten = {
      val __obj = js.Dynamic.literal(flatten = flatten.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flatten]
    }
    
    @scala.inline
    implicit class FlattenMutableBuilder[Self <: Flatten] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlatten(value: `true`): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Host extends StObject {
    
    var host: String = js.native
    
    var port: Double = js.native
    
    var secure: Boolean = js.native
  }
  object Host {
    
    @scala.inline
    def apply(host: String, port: Double, secure: Boolean): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: String = js.native
    
    var passphrase: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: String, passphrase: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    /**
      * The name of the tag. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.
      */
    var Name: String = js.native
    
    /**
      * The value of the tag. The value must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.
      */
    var Value: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(Name: String, Value: String): Name = {
      val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pending extends StObject {
    
    var pending: Boolean = js.native
    
    var ts: Double = js.native
  }
  object Pending {
    
    @scala.inline
    def apply(pending: Boolean, ts: Double): Pending = {
      val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pending]
    }
    
    @scala.inline
    implicit class PendingMutableBuilder[Self <: Pending] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prepared extends StObject {
    
    var prepared: Boolean = js.native
    
    var value: String = js.native
  }
  object Prepared {
    
    @scala.inline
    def apply(prepared: Boolean, value: String): Prepared = {
      val __obj = js.Dynamic.literal(prepared = prepared.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prepared]
    }
    
    @scala.inline
    implicit class PreparedMutableBuilder[Self <: Prepared] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrepared(value: Boolean): Self = StObject.set(x, "prepared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var key: String = js.native
    
    var value: String = js.native
  }
  object Value {
    
    @scala.inline
    def apply(key: String, value: String): Value = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
