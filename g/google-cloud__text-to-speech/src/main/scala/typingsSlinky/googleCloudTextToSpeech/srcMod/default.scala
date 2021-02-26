package typingsSlinky.googleCloudTextToSpeech.srcMod

import typingsSlinky.googleCloudTextToSpeech.anon.TypeofTextToSpeechClient
import typingsSlinky.googleCloudTextToSpeech.anon.Typeofv1
import typingsSlinky.googleCloudTextToSpeech.anon.Typeofv1beta1
import typingsSlinky.googleGax.clientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("@google-cloud/text-to-speech/build/src", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@google-cloud/text-to-speech/build/src", "default.TextToSpeechClient")
  @js.native
  def TextToSpeechClient: TypeofTextToSpeechClient = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@google-cloud/text-to-speech/build/src", "default.TextToSpeechClient")
  @js.native
  /**
    * Construct an instance of TextToSpeechClient.
    *
    * @param {object} [options] - The configuration object.
    * The options accepted by the constructor are described in detail
    * in [this document](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#creating-the-client-instance).
    * The common options are:
    * @param {object} [options.credentials] - Credentials object.
    * @param {string} [options.credentials.client_email]
    * @param {string} [options.credentials.private_key]
    * @param {string} [options.email] - Account email address. Required when
    *     using a .pem or .p12 keyFilename.
    * @param {string} [options.keyFilename] - Full path to the a .json, .pem, or
    *     .p12 key downloaded from the Google Developers Console. If you provide
    *     a path to a JSON file, the projectId option below is not necessary.
    *     NOTE: .pem and .p12 require you to specify options.email as well.
    * @param {number} [options.port] - The port on which to connect to
    *     the remote host.
    * @param {string} [options.projectId] - The project ID from the Google
    *     Developer's Console, e.g. 'grape-spaceship-123'. We will also check
    *     the environment variable GCLOUD_PROJECT for your project ID. If your
    *     app is running in an environment which supports
    *     {@link https://developers.google.com/identity/protocols/application-default-credentials Application Default Credentials},
    *     your project ID will be detected automatically.
    * @param {string} [options.apiEndpoint] - The domain name of the
    *     API remote host.
    * @param {gax.ClientConfig} [options.clientConfig] - client configuration override.
    *     TODO(@alexander-fenster): link to gax documentation.
    * @param {boolean} fallback - Use HTTP fallback mode.
    *     In fallback mode, a special browser-compatible transport implementation is used
    *     instead of gRPC transport. In browser context (if the `window` object is defined)
    *     the fallback mode is enabled automatically; set `options.fallback` to `false`
    *     if you need to override this behavior.
    */
  class TextToSpeechClientCls ()
    extends typingsSlinky.googleCloudTextToSpeech.v1Mod.TextToSpeechClient {
    def this(opts: ClientOptions) = this()
  }
  
  @scala.inline
  def TextToSpeechClient_=(x: TypeofTextToSpeechClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextToSpeechClient")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/text-to-speech/build/src", "default.v1")
  @js.native
  def v1: Typeofv1 = js.native
  @scala.inline
  def v1_=(x: Typeofv1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/text-to-speech/build/src", "default.v1beta1")
  @js.native
  def v1beta1: Typeofv1beta1 = js.native
  @scala.inline
  def v1beta1_=(x: Typeofv1beta1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
}
