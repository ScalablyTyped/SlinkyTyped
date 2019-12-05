package typingsSlinky.halogen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object halogenMod {
  import slinky.core.ReactComponentClass

  type BeatLoader = ReactComponentClass[MarginLoaderProps[String]]
  type BounceLoader = ReactComponentClass[SizeLoaderProps]
  type ClipLoader = ReactComponentClass[SizeLoaderProps]
  type DotLoader = ReactComponentClass[SizeLoaderProps]
  type FadeLoader = ReactComponentClass[RadiusLoaderProps]
  type GridLoader = ReactComponentClass[MarginLoaderProps[String]]
  type MoonLoader = ReactComponentClass[SizeLoaderProps]
  type PacmanLoader = ReactComponentClass[MarginLoaderProps[Double]]
  type PulseLoader = ReactComponentClass[MarginLoaderProps[String]]
  type RingLoader = ReactComponentClass[SizeLoaderProps]
  type RiseLoader = ReactComponentClass[MarginLoaderProps[String]]
  type RotateLoader = ReactComponentClass[MarginLoaderProps[String]]
  type ScaleLoader = ReactComponentClass[RadiusLoaderProps]
  type SkewLoader = ReactComponentClass[SizeLoaderProps]
  type SquareLoader = ReactComponentClass[SizeLoaderProps]
  type SyncLoader = ReactComponentClass[MarginLoaderProps[String]]
}
