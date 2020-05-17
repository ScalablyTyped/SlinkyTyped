package typingsSlinky.activexLibreoffice.com_.sun.star.mozilla

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface to run Mozilla XPCOM code to run Mozilla XPCOM code in OOo,you should first implement this interface, then pass this object to
  * xProxyRunner->Run
  * @see XProxyRunner
  * @see XMozillaBootstrap
  */
@js.native
trait XCodeProxy extends XInterface {
  /** which Mozilla product this code is write for */
  val ProductType: MozillaProductType = js.native
  /** which Mozilla profile this code will use */
  val ProfileName: String = js.native
  /** which Mozilla product this code is write for */
  def getProductType(): MozillaProductType = js.native
  /** which Mozilla profile this code will use */
  def getProfileName(): String = js.native
  /** all Mozilla XPCOM code must be called in {@link run()} or functions called by {@link run()} */
  def run(): Double = js.native
}

object XCodeProxy {
  @scala.inline
  def apply(
    ProductType: MozillaProductType,
    ProfileName: String,
    acquire: () => Unit,
    getProductType: () => MozillaProductType,
    getProfileName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    run: () => Double
  ): XCodeProxy = {
    val __obj = js.Dynamic.literal(ProductType = ProductType.asInstanceOf[js.Any], ProfileName = ProfileName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getProductType = js.Any.fromFunction0(getProductType), getProfileName = js.Any.fromFunction0(getProfileName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[XCodeProxy]
  }
  @scala.inline
  implicit class XCodeProxyOps[Self <: XCodeProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductType(value: MozillaProductType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProductType(value: () => MozillaProductType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProductType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProfileName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProfileName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRun(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

