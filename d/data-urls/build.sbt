organization := "org.scalablytyped.slinky"
name := "data-urls"
version := "2.0-dt-20201012Z-a28f08"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "webidl-conversions" % "6.1-dt-20200625Z-f56c00",
  "org.scalablytyped.slinky" %%% "whatwg-mimetype" % "2.1-dt-20200128Z-a6f736",
  "org.scalablytyped.slinky" %%% "whatwg-url" % "8.0-dt-20200519Z-50b3fc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
