organization := "org.scalablytyped.slinky"
name := "markdown-it-container"
version := "2.0-dt-20200515Z-7f5e36"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "linkify-it" % "2.1.0-dt-20200515Z-bbb287",
  "org.scalablytyped.slinky" %%% "markdown-it" % "v10.0.0-dt-20200426Z-e2e1ce",
  "org.scalablytyped.slinky" %%% "mdurl" % "1.0-dt-20200515Z-36cea0",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
