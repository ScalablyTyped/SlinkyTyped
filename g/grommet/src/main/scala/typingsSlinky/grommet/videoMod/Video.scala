package typingsSlinky.grommet.videoMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLVideoElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.controls
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.VideoHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet/es6/components/Video", "Video")
@js.native
class Video protected ()
  extends Component[
      VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        controls
      ]), 
      js.Object, 
      js.Any
    ] {
  def this(props: VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        controls
      ])) = this()
  def this(
    props: VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        controls
      ]),
    context: js.Any
  ) = this()
}
@JSImport("grommet/es6/components/Video", "Video")
@js.native
object Video extends TopLevel[
      ReactComponentClass[
        VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
          DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
          controls
        ])
      ]
    ]
