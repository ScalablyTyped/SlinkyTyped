package typingsSlinky.activexLibreoffice.com_.sun.star.lang

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Executing interface for executable components run by the uno executable loader. This is an application to run components passing the command line
  * arguments.
  */
@js.native
trait XMain extends XInterface {
  /**
    * This method is called to run the component.
    * @param aArguments arguments passed to the component, i.e. the command line arguments
    * @returns return value passed to be returned by main()
    */
  def run(aArguments: SeqEquiv[String]): Double = js.native
}

object XMain {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    run: SeqEquiv[String] => Double
  ): XMain = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[XMain]
  }
  @scala.inline
  implicit class XMainOps[Self <: XMain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRun(value: SeqEquiv[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

