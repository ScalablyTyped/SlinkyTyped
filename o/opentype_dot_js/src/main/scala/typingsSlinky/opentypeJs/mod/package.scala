package typingsSlinky.opentypeJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Contour = js.Array[typingsSlinky.opentypeJs.mod.Point]
  
  type KerningPairs = org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  type LocalizedName = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type Substitution = js.Function1[/* font */ typingsSlinky.opentypeJs.mod.Font, js.Any]
  
  @scala.inline
  def load(url: java.lang.String): js.Promise[typingsSlinky.opentypeJs.mod.Font] = typingsSlinky.opentypeJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.opentypeJs.mod.Font]]
  @scala.inline
  def load(
    url: java.lang.String,
    callback: js.Function2[
      /* error */ js.Any, 
      /* font */ js.UndefOr[typingsSlinky.opentypeJs.mod.Font], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.opentypeJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loadSync(url: java.lang.String): typingsSlinky.opentypeJs.mod.Font = typingsSlinky.opentypeJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(url.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.opentypeJs.mod.Font]
  @scala.inline
  def loadSync(url: java.lang.String, opt: typingsSlinky.opentypeJs.anon.LowMemory): typingsSlinky.opentypeJs.mod.Font = (typingsSlinky.opentypeJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(url.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.opentypeJs.mod.Font]
  
  @scala.inline
  def parse(buffer: js.Any): typingsSlinky.opentypeJs.mod.Font = typingsSlinky.opentypeJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.opentypeJs.mod.Font]
}
