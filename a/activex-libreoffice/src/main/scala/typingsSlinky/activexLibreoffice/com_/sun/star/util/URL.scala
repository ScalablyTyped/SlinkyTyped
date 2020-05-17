package typingsSlinky.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the structure of an Uniform Resource Locator.
  *
  * If the structure represents a valid {@link URL} or not depends on prior usage of the functions of {@link XURLTransformer} . Only after one of the
  * functions returned `TRUE` this can be assumed. ;  It is not necessary to set all of the fields; either {@link URL.Complete} or (some of) the others
  * are set. Additionally, most of the other fields, like URL::Host, {@link URL.Port} , {@link URL.User} , {@link URL.Password} , or {@link URL.Mark} ,
  * are optional.
  * @see XURLTransformer
  */
@js.native
trait URL extends js.Object {
  /** contains the arguments part of the {@link URL} , for example, "a=b" */
  var Arguments: String = js.native
  /**
    * contains the string representation of the complete {@link URL} , for example, [http://www.sun.de:8080/pub/test/foo.txt?a=b#xyz]{@link
    * url="http://www.sun.de:8080/pub/test/foo.txt?a=b#xyz"}
    *
    * It is used as a central input/output or input parameter for the interfaces of {@link XURLTransformer} . The usage of one of the {@link
    * XURLTransformer} function is mandatory to validate the {@link URL} . It cannot be assumed that {@link URL.Complete} represents always a valid URL!
    */
  var Complete: String = js.native
  /**
    * contains the {@link URL} without a mark and without arguments, for example, [http://www.sun.de:8080/pub/test/foo.txt]{@link
    * url="http://www.sun.de:8080/pub/test/foo.txt"}
    */
  var Main: String = js.native
  /** contains the mark part of the {@link URL} , for example, "xyz" */
  var Mark: String = js.native
  /**
    * contains the last segment of the hierarchical path of the {@link URL} , for the above example, "foo.txt"
    *
    * **Attention:** A service implementing the {@link XURLTransformer} interface will normally not detect if the last segment is a folder or a file. So it
    * is possible that the last segment describes a folder. If you want to be sure that a file {@link URL} that references a folder will be correctly put
    * into the {@link URL} fields you should append a "/" at the end of the hierarchical path.
    */
  var Name: String = js.native
  /** contains the users password of the {@link URL} , for example, "pass" */
  var Password: String = js.native
  /** contains all segments but the last one of the hierarchical path of the {@link URL} , for example, "/pub/test/" */
  var Path: String = js.native
  /** contains the port at the server of the {@link URL} , for example, "8080" */
  var Port: Double = js.native
  /** contains the protocol (scheme) of the {@link URL} , for example, "http" */
  var Protocol: String = js.native
  /** contains the server part of the {@link URL} , for example, "www.sun.de" */
  var Server: String = js.native
  /** contains the user-identifier of the {@link URL} , for example, "me" */
  var User: String = js.native
}

object URL {
  @scala.inline
  def apply(
    Arguments: String,
    Complete: String,
    Main: String,
    Mark: String,
    Name: String,
    Password: String,
    Path: String,
    Port: Double,
    Protocol: String,
    Server: String,
    User: String
  ): URL = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Complete = Complete.asInstanceOf[js.Any], Main = Main.asInstanceOf[js.Any], Mark = Mark.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
    __obj.asInstanceOf[URL]
  }
  @scala.inline
  implicit class URLOps[Self <: URL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

