package typingsSlinky.oauthJs.OAuth

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oauthJs.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureMethodStatic extends js.Object {
  /** A map from signature method name to constructor. */
  var REGISTERED: StringDictionary[Instantiable] = js.native
  /**
    * Generate a signature base string from a Message object.
    * @see {@link https://tools.ietf.org/html/rfc5849#section-3.4.1}
    * @param message Source of the signature base string.
    */
  def getBaseString(message: Message): String = js.native
  /**
    * Create a subclass of OAuth.SignatureMethod, with the given getSignature function.
    * @param getSignatureFunction
    */
  def makeSubclass(getSignatureFunction: js.Function1[/* baseString */ String, String]): Instantiable = js.native
  /** Instantiate a SignatureMethod for the given method name. */
  def newMethod(name: String, accessor: Accessor): SignatureMethod = js.native
  def normalizeParameters(parameters: ParameterListOrMap): String = js.native
  def normalizeUrl(url: String): String = js.native
  def parseUri(str: String): Uri = js.native
  /**
    * Subsequently, the given constructor will be used for the named methods.
    * The constructor will be called with no parameters.
    * The resulting object should usually implement getSignature(baseString).
    * You can easily define such a constructor by calling makeSubclass method.
    */
  def registerMethodClass(names: js.Array[String], classConstructor: Instantiable): Unit = js.native
  def sign(message: Message, accessor: Accessor): Unit = js.native
}

object SignatureMethodStatic {
  @scala.inline
  def apply(
    REGISTERED: StringDictionary[Instantiable],
    getBaseString: Message => String,
    makeSubclass: js.Function1[/* baseString */ String, String] => Instantiable,
    newMethod: (String, Accessor) => SignatureMethod,
    normalizeParameters: ParameterListOrMap => String,
    normalizeUrl: String => String,
    parseUri: String => Uri,
    registerMethodClass: (js.Array[String], Instantiable) => Unit,
    sign: (Message, Accessor) => Unit
  ): SignatureMethodStatic = {
    val __obj = js.Dynamic.literal(REGISTERED = REGISTERED.asInstanceOf[js.Any], getBaseString = js.Any.fromFunction1(getBaseString), makeSubclass = js.Any.fromFunction1(makeSubclass), newMethod = js.Any.fromFunction2(newMethod), normalizeParameters = js.Any.fromFunction1(normalizeParameters), normalizeUrl = js.Any.fromFunction1(normalizeUrl), parseUri = js.Any.fromFunction1(parseUri), registerMethodClass = js.Any.fromFunction2(registerMethodClass), sign = js.Any.fromFunction2(sign))
    __obj.asInstanceOf[SignatureMethodStatic]
  }
  @scala.inline
  implicit class SignatureMethodStaticOps[Self <: SignatureMethodStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withREGISTERED(value: StringDictionary[Instantiable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REGISTERED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBaseString(value: Message => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBaseString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMakeSubclass(value: js.Function1[/* baseString */ String, String] => Instantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeSubclass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewMethod(value: (String, Accessor) => SignatureMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMethod")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNormalizeParameters(value: ParameterListOrMap => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeParameters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNormalizeUrl(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseUri(value: String => Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseUri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterMethodClass(value: (js.Array[String], Instantiable) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerMethodClass")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSign(value: (Message, Accessor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

