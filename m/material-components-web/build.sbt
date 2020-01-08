organization := "org.scalablytyped.slinky"
name := "material-components-web"
version := "4.0.0-9a8c85"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "material__auto-init" % "0.35-dt-20190213Z-b4b734",
  "org.scalablytyped.slinky" %%% "material__base" % "0.35-dt-20191126Z-acdc3a",
  "org.scalablytyped.slinky" %%% "material__checkbox" % "0.35-dt-20191126Z-fd5d80",
  "org.scalablytyped.slinky" %%% "material__chips" % "0.35-dt-20191126Z-4f8401",
  "org.scalablytyped.slinky" %%% "material__data-table" % "4.0.0-b314b5",
  "org.scalablytyped.slinky" %%% "material__dialog" % "0.35-dt-20191126Z-381f67",
  "org.scalablytyped.slinky" %%% "material__drawer" % "0.43-dt-20191126Z-c912bb",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "0.35-dt-20191126Z-f15096",
  "org.scalablytyped.slinky" %%% "material__form-field" % "0.35-dt-20191126Z-11ad25",
  "org.scalablytyped.slinky" %%% "material__grid-list" % "0.35-dt-20191126Z-cee08b",
  "org.scalablytyped.slinky" %%% "material__icon-button" % "4.0.0-cb3e80",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "0.35-dt-20191126Z-f58877",
  "org.scalablytyped.slinky" %%% "material__linear-progress" % "0.35-dt-20191126Z-c9064a",
  "org.scalablytyped.slinky" %%% "material__list" % "0.43-dt-20191126Z-349ffe",
  "org.scalablytyped.slinky" %%% "material__menu" % "0.35-dt-20191126Z-dd6b52",
  "org.scalablytyped.slinky" %%% "material__menu-surface" % "4.0.0-1a3020",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "0.35-dt-20191126Z-6079b8",
  "org.scalablytyped.slinky" %%% "material__radio" % "0.35-dt-20191126Z-f13436",
  "org.scalablytyped.slinky" %%% "material__ripple" % "0.35-dt-20191126Z-873c94",
  "org.scalablytyped.slinky" %%% "material__select" % "0.35-dt-20191126Z-933356",
  "org.scalablytyped.slinky" %%% "material__selection-control" % "0.35-dt-20190213Z-f23dab",
  "org.scalablytyped.slinky" %%% "material__slider" % "0.35-dt-20191126Z-56a684",
  "org.scalablytyped.slinky" %%% "material__snackbar" % "0.35-dt-20191126Z-34f2f4",
  "org.scalablytyped.slinky" %%% "material__switch" % "4.0.0-10a068",
  "org.scalablytyped.slinky" %%% "material__tab" % "0.35-dt-20191126Z-7e94fd",
  "org.scalablytyped.slinky" %%% "material__tab-bar" % "4.0.0-1ea51d",
  "org.scalablytyped.slinky" %%% "material__tab-indicator" % "4.0.0-d9b96b",
  "org.scalablytyped.slinky" %%% "material__tab-scroller" % "4.0.0-d6ae90",
  "org.scalablytyped.slinky" %%% "material__textfield" % "0.35-dt-20191126Z-5ab54e",
  "org.scalablytyped.slinky" %%% "material__top-app-bar" % "0.35-dt-20191126Z-d8e484",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        