package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.FormatLang
import typingsSlinky.ariClient.anon.SoundId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sounds extends StObject {
  
  /**
    * Get a sounds details.
    *
    * @param params.soundId - Sounds id.
    */
  def get(params: SoundId): js.Promise[Sound] = js.native
  /**
    * Get a sounds details.
    *
    * @param params.soundId - Sounds id.
    */
  def get(params: SoundId, callback: js.Function2[/* err */ js.Error, /* sound */ Sound, Unit]): Unit = js.native
  
  /**
    * List all sounds.
    *
    * @param [params.lang] - Lookup sound for a specific language.
    * @param [params.format] - Lookup sound in a specific format.
    */
  def list(): js.Promise[js.Array[Sound]] = js.native
  /**
    * List all sounds.
    */
  def list(callback: js.Function2[/* err */ js.Error, /* sounds */ js.Array[Sound], Unit]): Unit = js.native
  def list(params: FormatLang): js.Promise[js.Array[Sound]] = js.native
  /**
    * List all sounds.
    *
    * @param [params.lang] - Lookup sound for a specific language.
    * @param [params.format] - Lookup sound in a specific format.
    */
  def list(params: FormatLang, callback: js.Function2[/* err */ js.Error, /* sounds */ js.Array[Sound], Unit]): Unit = js.native
}
