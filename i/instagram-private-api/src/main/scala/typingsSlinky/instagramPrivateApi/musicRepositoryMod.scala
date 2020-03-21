package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsSlinky.instagramPrivateApi.musicRepositoryGenresResponseMod.MusicRepositoryGenresResponseRootObject
import typingsSlinky.instagramPrivateApi.musicRepositoryLyricsResponseMod.MusicRepositoryLyricsResponseRootObject
import typingsSlinky.instagramPrivateApi.musicRepositoryMoodsResponseMod.MusicRepositoryMoodsResponseRootObject
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/music.repository", JSImport.Namespace)
@js.native
object musicRepositoryMod extends js.Object {
  @js.native
  class MusicRepository () extends Repository {
    def genres(): js.Promise[MusicRepositoryGenresResponseRootObject] = js.native
    def genres(product: IgAppModule): js.Promise[MusicRepositoryGenresResponseRootObject] = js.native
    def lyrics(trackId: String): js.Promise[MusicRepositoryLyricsResponseRootObject] = js.native
    def lyrics(trackId: Double): js.Promise[MusicRepositoryLyricsResponseRootObject] = js.native
    def moods(): js.Promise[MusicRepositoryMoodsResponseRootObject] = js.native
    def moods(product: IgAppModule): js.Promise[MusicRepositoryMoodsResponseRootObject] = js.native
  }
  
}

