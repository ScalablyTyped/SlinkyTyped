organization := "org.scalablytyped.slinky"
name := "data-urls"
version := "2.0-dt-20201012Z-775b00"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "webidl-conversions" % "6.1-dt-20200625Z-c9e5e0",
  "org.scalablytyped.slinky" %%% "whatwg-mimetype" % "2.1-dt-20200128Z-2d4476",
  "org.scalablytyped.slinky" %%% "whatwg-url" % "8.0-dt-20200519Z-644cbf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
