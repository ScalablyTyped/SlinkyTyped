package typingsSlinky.awsSdk.ec2instanceconnectMod

import typingsSlinky.awsSdk.configBaseMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2InstanceConnect extends Service {
  
  @JSName("config")
  var config_EC2InstanceConnect: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.
    */
  def sendSSHPublicKey(): Request[SendSSHPublicKeyResponse, AWSError] = js.native
  def sendSSHPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ SendSSHPublicKeyResponse, Unit]): Request[SendSSHPublicKeyResponse, AWSError] = js.native
  /**
    * Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.
    */
  def sendSSHPublicKey(params: SendSSHPublicKeyRequest): Request[SendSSHPublicKeyResponse, AWSError] = js.native
  def sendSSHPublicKey(
    params: SendSSHPublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendSSHPublicKeyResponse, Unit]
  ): Request[SendSSHPublicKeyResponse, AWSError] = js.native
}
