organization := "org.scalablytyped.slinky"
name := "sanitize-html"
version := "1.27-dt-20200909Z-d42e80"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "domhandler" % "2.4-dt-20200515Z-014115",
  "org.scalablytyped.slinky" %%% "domutils" % "1.7-dt-20200908Z-2cfc30",
  "org.scalablytyped.slinky" %%% "htmlparser2" % "v3.10.x-dt-20201002Z-61a54e",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
