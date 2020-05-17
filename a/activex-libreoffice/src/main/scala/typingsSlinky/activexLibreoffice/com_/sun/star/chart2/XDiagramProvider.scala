package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gives access to a single diagram. This interface is needed by the wrapper for the old API (namespace {@link com.sun.star.chart} ). */
@js.native
trait XDiagramProvider extends XInterface {
  var Diagram: XDiagram = js.native
  def getDiagram(): XDiagram = js.native
  def setDiagram(xDiagram: XDiagram): Unit = js.native
}

object XDiagramProvider {
  @scala.inline
  def apply(
    Diagram: XDiagram,
    acquire: () => Unit,
    getDiagram: () => XDiagram,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDiagram: XDiagram => Unit
  ): XDiagramProvider = {
    val __obj = js.Dynamic.literal(Diagram = Diagram.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDiagram = js.Any.fromFunction0(getDiagram), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDiagram = js.Any.fromFunction1(setDiagram))
    __obj.asInstanceOf[XDiagramProvider]
  }
  @scala.inline
  implicit class XDiagramProviderOps[Self <: XDiagramProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiagram(value: XDiagram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Diagram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDiagram(value: () => XDiagram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiagram")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDiagram(value: XDiagram => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDiagram")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

